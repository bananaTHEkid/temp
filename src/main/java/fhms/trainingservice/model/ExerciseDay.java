package fhms.trainingservice.model;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class ExerciseDay {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer exerciseDayId;
    private Date exerciseDate;
    @OneToMany
    private List<ExercisePlan> exerciseList;


    public Integer getId() {
        return exerciseDayId;
    }

    public Date getExerciseDate() {
        return exerciseDate;
    }

    public void setExerciseDate(Date date) {
        this.exerciseDate = date;
    }

    public List getExerciseList() {
        return exerciseList;
    }

    public void setExerciseList(List list) {
        this.exerciseList = list;
    }
}
