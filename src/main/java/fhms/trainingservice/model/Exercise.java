package fhms.trainingservice.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Exercise {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer exerciseId;
    private String exerciseName;
    private Integer repetitions;
    private Float weight;

    public Exercise(){
    }

    public Exercise(String name, Integer repetitions, Float weight){
        this.exerciseName = name;
        this.repetitions = repetitions;
        this.weight = weight;
    }

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

    @Override
    public String toString() {
        return "Exercise{" +
                "id=" + exerciseId +
                ", name='" + exerciseName + '\'' +
                ", repetitions='" + repetitions + '\'' +
                ", weight='" + weight + '\'' +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Exercise)) return false;
        Exercise exercise = (Exercise) o;
        return Objects.equals(exerciseId, exercise.exerciseId) &&
                Objects.equals(exerciseName, exercise.exerciseName) &&
                weight == exercise.weight &&
                repetitions == exercise.repetitions;
    }

    @Override
    public int hashCode() {
        return Objects.hash(exerciseId, exerciseName, repetitions, weight);
    }
}
