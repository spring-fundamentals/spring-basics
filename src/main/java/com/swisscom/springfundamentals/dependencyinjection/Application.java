package com.swisscom.springfundamentals.dependencyinjection;

import com.swisscom.springfundamentals.dependencyinjection.controller.CustomerController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

  public static void main(String[] args) {
    ConfigurableApplicationContext applicationContext = SpringApplication.run(Application.class, args);

    CustomerController customerController = applicationContext.getBean(CustomerController.class);

    customerController.deactivateCustomerAccount("1");
  }
}
