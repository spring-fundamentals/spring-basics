package ch.mare.springfundamentals.dependencyinjection.di_01.service;

import ch.mare.springfundamentals.dependencyinjection.common.domain.Customer;
import ch.mare.springfundamentals.dependencyinjection.common.service.EmailService;
import ch.mare.springfundamentals.dependencyinjection.common.service.PostalService;
import ch.mare.springfundamentals.dependencyinjection.di_01.dataaccess.CustomerLoader;

public class CustomerService {

  public void removeCustomer(String customerId) {

    CustomerLoader customerLoader = new CustomerLoader();
    Customer customer = customerLoader.findById(customerId);

    deactivate(customer);

    if (customer.hasEmailAddress()) {
      EmailService emailService = new EmailService();
      emailService.send(customer.getEmailAddress(), "Customer Account", "Your customer account has been successfully removed");
    }

    PostalService postalService = new PostalService();
    postalService.sendLetter(customer.getMailingAddress());
  }

  private void deactivate(Customer customer) {
    customer.deactivate();
    //persist changes
  }
}
