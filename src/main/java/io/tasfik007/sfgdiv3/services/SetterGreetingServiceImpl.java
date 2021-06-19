package io.tasfik007.sfgdiv3.services;

import org.springframework.stereotype.Service;

@Service
public class SetterGreetingServiceImpl implements GreetingService{
    @Override
    public String sayHello() {
        return "HelloWorld - Setter";
    }
}
