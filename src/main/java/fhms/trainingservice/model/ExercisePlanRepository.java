package fhms.trainingservice.model;

import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ExercisePlanRepository {
    Optional<ExercisePlan> findById(Integer id);
    ExercisePlan save(ExercisePlan e);
    void delete(ExercisePlan e);
}
