package com.springfundamentals.dependencyinjection;

import com.springfundamentals.dependencyinjection.controller.CustomerController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
//@ComponentScan({"com.springfundamentals.dependencyinjection", "com.swisscom.customerclient"})
//@Import(CustomerClientConfiguration.class)
//@EnableCustomerClient
//Auto Config
public class Application {

    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(Application.class, args);

        CustomerController customerController = applicationContext.getBean(CustomerController.class);

        customerController.deactivateCustomerAccount("1");
    }
}
