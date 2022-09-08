package fhms.trainingservice.outbound;

import fhms.trainingservice.model.*;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Repository
public interface ExerciseJpaRepository extends CrudRepository<Exercise, Integer>, ExerciseRepository {

    Optional<Exercise> findById(Integer id);

}
