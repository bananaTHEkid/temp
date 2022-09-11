package fhms.trainingservice;

import fhms.trainingservice.model.Exercise;
import fhms.trainingservice.model.ExercisePlan;
import fhms.trainingservice.model.ExercisePlanRepository;
import fhms.trainingservice.model.ExerciseRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
public class PersistenceTests {

    @Autowired
    private ExerciseRepository exerciseRepository;

    @Autowired
    private ExercisePlanRepository exercisePlanRepository;

    @Test
    public void findByIdShouldWork() {
        List<Exercise> exercises1 = exerciseRepository.findById(1);
        assertEquals (1, exercises1.get(1).getExerciseId());
        Optional<ExercisePlan> exercisePlans = exercisePlanRepository.findById(1);
        assertTrue (exercisePlans.isEmpty());
    }
}