package ch.mare.springfundamentals.dependencyinjection.di_02.dataaccess;

import ch.mare.springfundamentals.dependencyinjection.common.domain.Customer;
import ch.mare.springfundamentals.dependencyinjection.common.domain.MailingAddress;
import java.util.HashMap;
import java.util.Map;

public class InMemoryDatabase {

  public static final Map<String, Customer> DATABASE = new HashMap<>() {{
    put("1", new Customer("1", "Hans Wurst", new MailingAddress("Hauptstrasse 2", "Zürich"), "hans@wurst.ch"));
    put("2", new Customer("2", "Peter Peterson", new MailingAddress("Bahnhofsweg 100", "Bern"), "peter@peterson.ch"));
  }};
}
