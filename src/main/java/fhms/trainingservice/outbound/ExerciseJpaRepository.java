package fhms.trainingservice.outbound;

import fhms.trainingservice.model.*;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ExerciseJpaRepository extends CrudRepository<Exercise, Integer>, ExerciseRepository {

    List<Exercise> findById(Integer id);

}
