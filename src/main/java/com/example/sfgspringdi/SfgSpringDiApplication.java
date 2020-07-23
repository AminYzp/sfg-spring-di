package com.example.sfgspringdi;

import com.example.sfgspringdi.controllers.ConstructorInjectedController;
import com.example.sfgspringdi.controllers.MyController;
import com.example.sfgspringdi.controllers.PropertyInjectedController;
import com.example.sfgspringdi.controllers.SetterInjectedController;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgSpringDiApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(SfgSpringDiApplication.class, args);
        MyController myController = (MyController) applicationContext.getBean("myController");
        // Like the way is used in old Spring version for creating object by means of .getBean() method.
        // note : beans name is same as the class name but the beginning with lower case. MyController => myController
        System.out.println(myController.sayHello());
        System.out.println("1#############################################");
        SetterInjectedController setterInjectedController = (SetterInjectedController) applicationContext.getBean("setterInjectedController");
        System.out.println(setterInjectedController.getGreetingService());
        System.out.println("2#############################################");
        PropertyInjectedController propertyInjectedController = (PropertyInjectedController) applicationContext.getBean("propertyInjectedController");
        System.out.println(propertyInjectedController.getGreetingService());
        System.out.println("3#############################################");
        ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) applicationContext.getBean("constructorInjectedController");
        System.out.println(constructorInjectedController.getGreetingService());

    }
}
