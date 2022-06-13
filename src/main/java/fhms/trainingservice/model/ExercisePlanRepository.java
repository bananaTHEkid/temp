package fhms.trainingservice.model;

import java.util.Optional;

public interface ExercisePlanRepository {
    Optional<ExercisePlan> findById(Integer id);
}
