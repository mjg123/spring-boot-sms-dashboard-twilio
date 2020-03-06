package lol.gilliard.smsdashboard;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {

    @Value("${phoneNumber:** Todo: buy a phone number from Twilio **}")
    private String phoneNumber;

    @GetMapping("/")
    public ModelAndView showDashboard(){
        ModelAndView dashboard = new ModelAndView("dashboard");
        dashboard.addObject("phoneNumber", phoneNumber);
        return dashboard;
    }

}
