package ch.mare.springfundamentals.profiles._02.dataaccess.real;

import ch.mare.springfundamentals.dependencyinjection.common.domain.Customer;
import ch.mare.springfundamentals.dependencyinjection.common.domain.MailingAddress;
import ch.mare.springfundamentals.profiles._02.dataaccess.CustomerLoader;
import java.util.HashMap;
import java.util.Map;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("real")
public class CustomerLoaderReal implements CustomerLoader {

  private static final Map<String, Customer> DATABASE = new HashMap<>() {{
    put("1", new Customer("1", "Hans Wurst", new MailingAddress("Hauptstrasse 2", "Zürich"), "hans@wurst.ch"));
    put("2", new Customer("2", "Peter Peterson", new MailingAddress("Bahnhofsweg 100", "Bern"), "peter@peterson.ch"));
  }};

  public Customer findById(String customerId) {
    return DATABASE.get(customerId);
  }

}
