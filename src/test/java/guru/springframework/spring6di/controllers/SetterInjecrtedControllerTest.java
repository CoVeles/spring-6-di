package guru.springframework.spring6di.controllers;

import guru.springframework.spring6di.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SetterInjecrtedControllerTest {
    SetterInjecrtedController setterInjecrtedController;
    @BeforeEach
    void setUp() {
        setterInjecrtedController = new SetterInjecrtedController();
        setterInjecrtedController.setGreetingService(new GreetingServiceImpl());
    }

    @Test
    void sayHello() {
        System.out.println(setterInjecrtedController.sayHello()  );
    }
}