package fhms.trainingservice.inbound;

import com.fasterxml.jackson.annotation.JsonIgnore;
import fhms.trainingservice.model.Exercise;
import fhms.trainingservice.model.ExerciseDay;
import fhms.trainingservice.model.ExercisePlan;

import java.util.Date;
import java.util.List;
import java.util.Set;

public class ExercisePlanDto {

    private Integer id;
    private String name;

    public ExercisePlanDto() {
    }

    public ExercisePlanDto(ExercisePlan p){
        this(p.getId(), p.getName());
    }

    public ExercisePlanDto(Integer exerciseId, String name) {
        this.id = exerciseId;
        this.name = name;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}