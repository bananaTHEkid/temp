package fhms.trainingservice;

import fhms.trainingservice.model.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.*;

import static org.hamcrest.CoreMatchers.is;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.times;

@ExtendWith(MockitoExtension.class)
public class TrainingServiceTest {

    @Mock
    private ExerciseRepository exerciseRepository;
    @Mock
    private ExercisePlanRepository exercisePlanRepository;
    @Mock
    private ExerciseDayRepository exerciseDayRepository;

    private TrainingService subject;
    private ExerciseDay exerciseDay;
    private Set<Exercise> exercises = new HashSet<>();
    private Exercise exercise;
    private ExercisePlan exercisePlan;

    private static final String TEST_EXERCISENAME = "SITUPS";
    private static final String TEST_EXERCISEPLANNAME = "MONDAYSET";
    private static final Integer TEST_REPETITIONS = 10;
    private static final Float TEST_WEIGHT = 10f;
    private static final Date TEST_DATE = new Date(2323223232L);

    @BeforeEach
    public void setUp() throws Exception {
        exercise.setExerciseName(TEST_EXERCISENAME);
        exercise.setRepetitions(TEST_REPETITIONS);
        exercise.setWeight(TEST_WEIGHT);

        this.subject = new TrainingService(this.exerciseDayRepository, this.exercisePlanRepository,this.exerciseRepository);
        this.exerciseDay = new ExerciseDay();
        this.exerciseDay.setExerciseDate(TEST_DATE);
    }

}