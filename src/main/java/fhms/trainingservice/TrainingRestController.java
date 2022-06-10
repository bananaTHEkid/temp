package fhms.trainingservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/train")
public class TrainingRestController {
    @GetMapping("/train/start")
    public void startTraining(){

    }

    @GetMapping
    public Trainingplan getTrainingPlan(@RequestParam(value="id") String id){
        TrainingPlan plan;

        return plan;
    }
}
