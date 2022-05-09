package fhms.trainingservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TrainingRestController {
    @GetMapping("/training")
    public void startTraining(){
        
    }
}
