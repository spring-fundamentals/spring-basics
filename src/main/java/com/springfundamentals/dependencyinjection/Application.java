package com.springfundamentals.dependencyinjection;

import com.springfundamentals.dependencyinjection.controller.CustomerController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
public class Application {

    public static void main(String[] args) {

        ApplicationContext ctx = new AnnotationConfigApplicationContext(Application.class);

        CustomerController customerController = ctx.getBean(CustomerController.class);

        customerController.deactivateCustomerAccount("1");
    }
}
