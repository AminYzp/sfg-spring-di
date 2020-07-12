package com.example.sfgspringdi;

import com.example.sfgspringdi.controllers.MyController;
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
    }
}
