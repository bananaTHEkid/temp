package fhms.trainingservice.model;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
public class ExercisePlan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;
    @OneToMany
    private Set<Exercise> exercises;
    private String name;

    public ExercisePlan(){ }

    public ExercisePlan(Set<Exercise> exercises, String name){
        this.exercises = exercises;
        this.name = name;
    }

    public Integer getId() {
        return Id;
    }

    public Set<Exercise> getExerciseList() {
        return exercises;
    }

    public void setExerciseList(List<Exercise> exerciseList) {
        this.exercises = exercises;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        name = name;
    }

    @Override
    public String toString() {
        return "Exercise{" +
                "id=" + Id +
                ", name='" + name + '\'' +
                ", exercises='" + exercises + '\'' +
                '}';
    }
}
