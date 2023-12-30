package azure.demployment.practice.AzureDeploymentPractice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AzureDemoController {
    @GetMapping("/say")
    public String display(){
        return "Jai Mata dee";
    }
}
