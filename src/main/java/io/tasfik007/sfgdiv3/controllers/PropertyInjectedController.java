package io.tasfik007.sfgdiv3.controllers;

import io.tasfik007.sfgdiv3.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

    @Qualifier("propertyGreetingServiceImpl")
    @Autowired
    GreetingService greetingService;

    public  String getGreeting(){
        return greetingService.sayHello();
    }
}
