package fhms.trainingservice.inbound;

import com.fasterxml.jackson.annotation.JsonIgnore;
import fhms.trainingservice.model.Exercise;
import fhms.trainingservice.model.ExerciseDay;
import fhms.trainingservice.model.ExercisePlan;

import java.util.Date;
import java.util.List;
import java.util.Set;

public class ExerciseDayDto {

    private Integer id;
    private Date date;
    @JsonIgnore
    private Set<ExercisePlan> exercisePlans;

    public ExerciseDayDto() {
    }

    public ExerciseDayDto(ExerciseDay p){
        this(p.getId(), p.getExerciseDate());
    }

    public ExerciseDayDto(Integer exerciseId, Date date) {
        this.id = exerciseId;
        this.date = date;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}