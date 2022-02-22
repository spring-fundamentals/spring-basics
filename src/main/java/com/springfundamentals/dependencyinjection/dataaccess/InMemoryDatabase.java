package com.springfundamentals.dependencyinjection.dataaccess;

import com.springfundamentals.dependencyinjection.domain.Customer;
import com.springfundamentals.dependencyinjection.domain.MailingAddress;
import java.util.HashMap;
import java.util.Map;

public class InMemoryDatabase {

  public static final Map<String, Customer> DATABASE = new HashMap<>() {{
    put("1", new Customer("1", "Gerd Müller", new MailingAddress("Hauptstrasse 2", "Zürich"), "gerd@mueller.ch"));
    put("2", new Customer("2", "Sepp ˚Maier", new MailingAddress("Bahnhofsweg 100", "Bern"), "sepp@maier.ch"));
  }};
}
