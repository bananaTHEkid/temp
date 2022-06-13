package fhms.trainingservice.model;

import java.util.Optional;

public interface ExerciseDayRepository {
    Optional<ExerciseDay> findById(Integer id);

}
