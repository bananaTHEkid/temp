package fhms.trainingservice.model;

import javax.persistence.*;

@Entity
public class Exercise {

    @Id
    @GeneratedValue
    private Integer exerciseId;
    private String exerciseName;
    private Integer repetitions;
    private Float weight;

    public Integer getExerciseId(){
        return exerciseId;
    }

    public String getExerciseName() {
        return exerciseName;
    }

    public void setExerciseName(String exerciseName) {
        this.exerciseName = exerciseName;
    }

    public Integer getRepetitions() {
        return repetitions;
    }

    public void setRepetitions(Integer repetitions) {
        this.repetitions = repetitions;
    }

    public Float getWeight() {
        return weight;
    }

    public void setWeight(Float weight) {
        this.weight = weight;
    }
}
