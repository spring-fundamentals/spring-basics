package com.zuehlke.springfundamentals.dependencyinjection.service;

import com.zuehlke.springfundamentals.dependencyinjection.dataaccess.CustomerLoader;
import com.zuehlke.springfundamentals.dependencyinjection.domain.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CustomerService {

  private static final String DEACTIVATION_MESSAGE = "Your customer account has been successfully removed";

  private final CustomerLoader customerLoader;
  private final EmailService emailService;
  private final PostalService postalService;

  public CustomerService(CustomerLoader customerLoader, EmailService emailService,
      PostalService postalService) {
    this.customerLoader = customerLoader;
    this.emailService = emailService;
    this.postalService = postalService;
  }

  @Autowired
  public void deactivateCustomer(String customerId) {

    Customer customer = customerLoader.findById(customerId);

    if (customer.hasEmailAddress()) {
      String emailAddress = customer.getEmailAddress();
      emailService.send(emailAddress, "Customer Account", DEACTIVATION_MESSAGE);
    }

    postalService.sendLetter(customer.getMailingAddress(), DEACTIVATION_MESSAGE);
  }
}
