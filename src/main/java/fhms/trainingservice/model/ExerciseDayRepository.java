package fhms.trainingservice.model;

import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ExerciseDayRepository {
    Optional<ExerciseDay> findById(Integer id);
    ExerciseDay save(ExerciseDay exerciseDay);
    void delete(ExerciseDay exerciseDay);
    Iterable<ExerciseDay> findAll();

}
