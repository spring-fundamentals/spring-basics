package com.zuehlke.springfundamentals.dependencyinjection.dataaccess;

import com.zuehlke.springfundamentals.dependencyinjection.domain.Customer;
import com.zuehlke.springfundamentals.dependencyinjection.domain.MailingAddress;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "customer.loader.mock", havingValue = "false")
public class RemoteCustomerLoader implements CustomerLoader {

  @Override
  public Customer findById(String customerId) {

    System.out.println("making a remote call to url: ...");

    return InMemoryDatabase.DATABASE.get(customerId);
  }
}
