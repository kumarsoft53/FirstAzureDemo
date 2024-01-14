package azure.demployment.practice.AzureDeploymentPractice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AzureDemoController {
    @GetMapping("/say")
    public String display(){

        //
        return "<!DOCTYPE html>\n" +
                "<html>\n" +
                "<head>\n" +
                "<style>\n" +
                "#example1 {\n" +
                "  border: 2px solid black;\n" +
                "  padding: 25px;\n" +
                "  background-color:#bdf;\n" +
                "  background-repeat: no-repeat;\n" +
                "  background-size: auto;\n" +
                "}\n" +
                "#h1 {\n" +
                "  background: red;\n" +
                "  color: #fff;\n" +
                "  padding: 15px;\n" +
                "  background-size: auto;\n" +
                "}\n" +
                "\n" +
                "</style>\n" +
                "</head>\n" +
                "<body>\n" +
                "\n" +
                "<h2 id=\"h1\">Disclaimer:  This is my practice project</h2>\n" +
                "<div id=\"example1\">\n" +
                "  <h2>Next Project Yummy Food coming soon</h2>\n" +
                "  <p>Note:  Service implementation part is pending </p>\n" +
                "</div>\n" +
                "\n" +
                "<h2>Technology stacks</h2>\n" +
                "<div id=\"example2\">\n" +
                "  <h2>Frontend:</h2>\n" +
                "  <p>React & Node JS</p>\n" +
                "  \n" +
                "  <h2>Backend:</h2>\n" +
                "  <p>Springboot</p>\n" +
                "  <p>MySql</p>\n" +
                "  <p><ul>Note: 1: CI/CD: we Use GitLab CI/CD to commit all code, build and run the required tests</ul>\n" +
                "  <ul>2: Azure AppDeployment to deploye the code</ul>\n" +
                "  <ul>3: App Insite to monitor logs</ul>\n" +
                "  </p>\n" +
                "  \n" +
                "</div>\n" +
                "\n" +
                "</body>\n" +
                "</html>";
        //


        //
      /*  return "<html>\n" +
                "<header><title>Welcome</title></header>\n" +
                "<body>" +
                "<h1 style=\"background-color:DodgerBlue;\"\n" + "Next project <u>Yummy Food</u> coming soon\n" + "<h1>" +
                "<h3>\n" + "Note:  Service implementation part is pending \n" + "</h3> </body>\n" + "</html>";
        //*/

   }
}
