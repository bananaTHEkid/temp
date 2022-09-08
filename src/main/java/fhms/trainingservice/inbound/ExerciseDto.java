package fhms.trainingservice.inbound;

import fhms.trainingservice.model.Exercise;

public class ExerciseDto {

    private Integer id;
    private String name;
    private Integer repetitions;
    private Float weight;

    public ExerciseDto() {
    }

    public ExerciseDto(Exercise p){
        this(p.getExerciseId(), p.getExerciseName(), p.getRepetitions(), p.getWeight());
    }

    public ExerciseDto(String name, Integer repetitions, Float weight) {
        this.name = name;
        this.repetitions = repetitions;
        this.weight = weight;
    }

    public ExerciseDto(Integer exerciseId, String exerciseName, Integer repetitions, Float weight) {
        this.id = exerciseId;
        this.name = exerciseName;
        this.repetitions = repetitions;
        this.weight = weight;
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

    public Integer getRepetitions() {
        return repetitions;
    }

    public void setRepetitions(Integer repetitions) {
        this.repetitions = repetitions;
    }

    public Float getWeight() {
        return weight;
    }

    public void setWeight(Float weight) { this.weight = weight; }
}