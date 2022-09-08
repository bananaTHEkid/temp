package fhms.trainingservice.model;


import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface ExerciseRepository {
    Optional<Exercise> findById(Integer id);
}
