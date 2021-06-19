package io.tasfik007.sfgdiv3.controllers;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Controller;

@Primary
@Controller
public class MyController {

    public String sayHello(){
        return "Hello World - primary bean";
    }
}
