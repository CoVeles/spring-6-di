package guru.springframework.spring6di.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SetterInjectedControllerTest {
    @Autowired
    SetterInjectedController setterInjectedController;
//    @BeforeEach
//    void setUp() {
//        setterInjecrtedController = new SetterInjecrtedController();
//        setterInjecrtedController.setGreetingService(new GreetingServiceImpl());
//    }

    @Test
    void sayHello() {
        System.out.println(setterInjectedController.sayHello()  );
    }
}