package ch.mare.springfundamentals.dependencyinjection.di_02.service;

import ch.mare.springfundamentals.dependencyinjection.common.domain.Customer;
import ch.mare.springfundamentals.dependencyinjection.common.service.EmailService;
import ch.mare.springfundamentals.dependencyinjection.common.service.PostalService;
import ch.mare.springfundamentals.dependencyinjection.di_02.dataaccess.CustomerLoader;

public class CustomerService {

  private CustomerLoader customerLoader;
  private EmailService emailService;
  private PostalService postalService;

  public CustomerService(CustomerLoader customerLoader, EmailService emailService, PostalService postalService) {
    this.customerLoader = customerLoader;
    this.emailService = emailService;
    this.postalService = postalService;
  }

  public void deactivateCustomer(String customerId) {

    Customer customer = customerLoader.findById(customerId);

    deactivate(customer);

    if (customer.hasEmailAddress()) {
      emailService.send(customer.getEmailAddress(), "Customer Account", "Your customer account has been successfully removed");
    }

    postalService.sendLetter(customer.getMailingAddress());
  }

  private void deactivate(Customer customer) {
    customer.deactivate();
    //persist changes
  }
}
