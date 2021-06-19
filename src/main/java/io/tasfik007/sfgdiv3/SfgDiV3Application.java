package io.tasfik007.sfgdiv3;

import io.tasfik007.sfgdiv3.controllers.ConstructorInjectedController;
import io.tasfik007.sfgdiv3.controllers.MyController;
import io.tasfik007.sfgdiv3.controllers.PropertyInjectedController;
import io.tasfik007.sfgdiv3.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiV3Application {

    public static void main(String[] args) {
        ApplicationContext ctx =  SpringApplication.run(SfgDiV3Application.class, args);
        MyController myController = (MyController) ctx.getBean("myController");
        System.out.println(myController.sayHello());

        PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
        System.out.println(propertyInjectedController.getGreeting());

        ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
        System.out.println(constructorInjectedController.getGreeting());

        SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
        System.out.println(setterInjectedController.getGreeting());
    }

}
