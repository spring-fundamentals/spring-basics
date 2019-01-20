package ch.mare.springfundamentals.dependencyinjection.service;

import ch.mare.springfundamentals.dependencyinjection.domain.Customer;
import ch.mare.springfundamentals.dependencyinjection.dataaccess.CustomerLoader;

public class CustomerService {

  private static final String DEACTIVATION_MESSAGE = "Your customer account has been successfully removed";

  public void deactivateCustomer(String customerId) {

    CustomerLoader customerLoader = new CustomerLoader();
    Customer customer = customerLoader.findById(customerId);

    if (customer.hasEmailAddress()) {
      String emailAddress = customer.getEmailAddress();
      EmailService emailService = new EmailService();
      emailService.send(emailAddress, "Customer Account", DEACTIVATION_MESSAGE);
    }

    PostalService postalService = new PostalService();
    postalService.sendLetter(customer.getMailingAddress(), DEACTIVATION_MESSAGE);
  }
}
