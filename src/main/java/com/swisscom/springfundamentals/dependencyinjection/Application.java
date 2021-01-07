package com.swisscom.springfundamentals.dependencyinjection;

import com.swisscom.springfundamentals.dependencyinjection.configuration.AppConfig;
import com.swisscom.springfundamentals.dependencyinjection.controller.CustomerController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

  public static void main(String[] args) {

    ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

    CustomerController customerController = ctx.getBean(CustomerController.class);

    customerController.deactivateCustomerAccount("1");
  }
}
