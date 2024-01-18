package azure.demployment.practice.AzureDeploymentPractice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AzureDemoController2 {
    @GetMapping("/say2")
    public String display2(){
        System.out.println("This is second controller");
        return "Jai Maa Sarswati... ";
    }
}