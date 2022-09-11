package fhms.trainingservice.inbound;

import fhms.trainingservice.model.Exercise;
import fhms.trainingservice.model.ExerciseDay;
import fhms.trainingservice.model.ExercisePlan;
import fhms.trainingservice.model.TrainingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
@RequestMapping("/rest/trainservice")
public class TrainingServiceController {

    private TrainingService trainingService;

    @Autowired
    public TrainingServiceController(TrainingService trainingService) {
        this.trainingService = trainingService;
    }

    @GetMapping("/exerciseDay/get/{id}")
    public ExerciseDayDto getExerciseDay(@PathVariable("id") Integer id){
        ExerciseDay exerciseDay = this.trainingService.getExerciseDay(id);
        return new ExerciseDayDto(exerciseDay);
    }

    @GetMapping("exercise/get/{id}")
    public ExerciseDto getExercise(@PathVariable("id") Integer id){
    Exercise exercise = this.trainingService.getExercise(id);
    return new ExerciseDto(exercise);
    }

    @PostMapping("exercise/set/{planId}/{dayId}")
    public ExerciseDayDto setExercise(@PathVariable("planId") Integer planId, @PathVariable("dayId") Integer dayId){
        ExerciseDay exercise = this.trainingService.addExercisePlan(planId, dayId);
        return new ExerciseDayDto(exercise);
    }
}
