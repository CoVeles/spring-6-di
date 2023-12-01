package guru.springframework.spring6di.controllers;

import guru.springframework.spring6di.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectedController {

    private GreetingService greetingService;
    @Autowired
    public void setGreetingService(GreetingService greetingService) {
        System.out.println("Setter is utilized");
        this.greetingService = greetingService;
        System.out.println(greetingService.sayGreeting());
    }

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
