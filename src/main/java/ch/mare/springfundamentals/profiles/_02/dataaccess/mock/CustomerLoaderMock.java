package ch.mare.springfundamentals.profiles._02.dataaccess.mock;

import ch.mare.springfundamentals.dependencyinjection.common.domain.Customer;
import ch.mare.springfundamentals.dependencyinjection.common.domain.MailingAddress;
import ch.mare.springfundamentals.profiles._02.dataaccess.CustomerLoader;
import java.util.HashMap;
import java.util.Map;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
public class CustomerLoaderMock implements CustomerLoader {
  private static final Map<String, Customer> DATABASE = new HashMap<>() {{
    put("1", new Customer("1", "Hans Tester", new MailingAddress("Teststrasse 2", "Zürich"), "hans@Test.ch"));
    put("2", new Customer("2", "Peter Qualitätssicherer", new MailingAddress("Testweg 100", "Bern"), "peter@test.ch"));
  }};

  public Customer findById(String customerId) {
    return DATABASE.get(customerId);
  }
}
