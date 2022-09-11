package fhms.trainingservice.model;


import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ExerciseRepository {
    List<Exercise> findById(Integer id);
}
