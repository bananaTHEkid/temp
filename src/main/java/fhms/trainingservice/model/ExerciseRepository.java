package fhms.trainingservice.model;

import java.util.Optional;

public interface ExerciseRepository {
    Optional<Exercise> findById(Integer id);
}
