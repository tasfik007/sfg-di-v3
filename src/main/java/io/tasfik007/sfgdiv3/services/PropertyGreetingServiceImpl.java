package io.tasfik007.sfgdiv3.services;

import org.springframework.stereotype.Service;

@Service
public class PropertyGreetingServiceImpl implements GreetingService{
    @Override
    public String sayHello() {
        return "HelloWorld - Property";
    }
}
