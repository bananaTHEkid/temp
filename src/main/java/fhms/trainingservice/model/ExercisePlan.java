package fhms.trainingservice.model;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.List;

public class ExercisePlan {
    @Id
    @GeneratedValue
    private Integer Id;
    private List<Exercise> exerciseList;
    private String Name;

    public Integer getId() {
        return Id;
    }

    public List<Exercise> getExerciseList() {
        return exerciseList;
    }

    public void setExerciseList(List<Exercise> exerciseList) {
        this.exerciseList = exerciseList;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}
