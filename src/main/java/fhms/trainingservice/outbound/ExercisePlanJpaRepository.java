package fhms.trainingservice.outbound;

import fhms.trainingservice.model.ExerciseDay;
import fhms.trainingservice.model.ExercisePlan;
import fhms.trainingservice.model.ExercisePlanRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Repository
public interface ExercisePlanJpaRepository extends CrudRepository<ExercisePlan, Integer>, ExercisePlanRepository {

    Optional<ExercisePlan> findById(Integer id);

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    ExercisePlan save(ExercisePlan exercisePlan);

}
