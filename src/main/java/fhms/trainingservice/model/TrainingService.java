package fhms.trainingservice.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
public class TrainingService {
    private ExerciseDayRepository exerciseDayRepository;
    private ExercisePlanRepository exercisePlanRepository;
    private ExerciseRepository exerciseRepository;

    @Autowired
    public TrainingService(ExerciseDayRepository exerciseDayRepository, ExercisePlanRepository exercisePlanRepository, ExerciseRepository exerciseRepository){
        this.exerciseDayRepository = exerciseDayRepository;
        this.exercisePlanRepository = exercisePlanRepository;
        this.exerciseRepository = exerciseRepository;
    }

    /**
     * Find a certain trainingDay in the database.
     * @param id of the requested Exercise Day
     * @return a ExerciseDay list
     */
    public ExerciseDay getExerciseDay(Integer id) {
        Optional<ExerciseDay> exerciseDayOptional = exerciseDayRepository.findById(id);
        System.out.println(exerciseDayOptional);
        if (exerciseDayOptional.isPresent()) {
            ExerciseDay exerciseDay = exerciseDayOptional.get();
            return exerciseDay;
        } else {
            throw new ResourceNotFoundException("Requested Exercise Day is not in DB");
        }
    }
    /**
     * Find a certain exercise in the database.
     * @param id of the requested Exercise
     * @return a Exercise
     */
    public Exercise getExercise(Integer id) {
        Optional<Exercise> exerciseOptional = exerciseRepository.findById(id);
        System.out.println(exerciseOptional);
        if (exerciseOptional.isPresent()) {
            Exercise exercise = exerciseOptional.get();
            return exercise;
        } else {
            throw new ResourceNotFoundException("Requested Exercise is not in DB");
        }
    }

    /**
     * Adds a new product to a shopping list.
     * @param planId of the shopping list
     * @param dayId of the product
     * @return the updated ExerciseDay entity
     */
    public ExerciseDay addExercisePlan(Integer planId, Integer dayId) {

        Optional<ExerciseDay> exerciseDayOptional = exerciseDayRepository.findById(dayId);
        Optional<ExercisePlan> exercisePlanOptional = exercisePlanRepository.findById(planId);

        if (exerciseDayOptional.isPresent() && exercisePlanOptional.isPresent()) {

            ExerciseDay exerciseDay = exerciseDayOptional.get();
            ExercisePlan exercisePlan = exercisePlanOptional.get();

            Set<ExercisePlan> exercisePlanList = exerciseDay.getExerciseList();

            for (ExercisePlan i : exercisePlanList) {
                if (i.getId().equals(planId)) {
                    throw new AlreadyExistException("Plan already exists");
                }
            }
            if(exerciseDay.getExerciseList().size() < 2){
                exerciseDay.getExerciseList().add(exercisePlan);
            }else{
                throw new RuntimeException("Day already has 2 plans");
            }
            return exerciseDay;
        }
        else {
            throw new ResourceNotFoundException("Requested exercisePlan is not in DB");
        }
    }


}
