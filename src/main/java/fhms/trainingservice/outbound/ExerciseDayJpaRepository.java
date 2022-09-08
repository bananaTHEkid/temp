package fhms.trainingservice.outbound;

import fhms.trainingservice.model.ExerciseDay;
import fhms.trainingservice.model.ExerciseDayRepository;
import fhms.trainingservice.model.ExercisePlan;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Repository
public interface ExerciseDayJpaRepository extends CrudRepository<ExerciseDay, Integer>, ExerciseDayRepository {

    Optional<ExerciseDay> findById(Integer id);

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    ExerciseDay save(ExerciseDay exerciseDay);


}
