package fhms.trainingservice.model;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import java.util.Set;

@Entity
public class ExerciseDay {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer exerciseDayId;
    private Date exerciseDate;
    @OneToMany
    private Set<ExercisePlan> exercisePlans;

    public ExerciseDay(){

    }

    public ExerciseDay(Date date, Set<ExercisePlan> plans){
        this.exerciseDate = date;
        this.exercisePlans = plans;
    }


    public Integer getId() {
        return exerciseDayId;
    }

    public Date getExerciseDate() {
        return exerciseDate;
    }

    public void setExerciseDate(Date date) {
        this.exerciseDate = date;
    }

    public Set<ExercisePlan> getExerciseList() {
        return exercisePlans;
    }

    public void setExerciseList(Set set) {
        this.exercisePlans = set ;
    }
    public void addExercisePlan(ExercisePlan plan){
        this.exercisePlans.add(plan);
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + exerciseDayId +
                ", date='" + exerciseDate + '\'' +
                ", exercise-plans='" + exercisePlans +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(exerciseDayId, exerciseDate,exercisePlans);
    }
}
