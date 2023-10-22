package com.springfundamentals.dependencyinjection.dataaccess;

import com.springfundamentals.dependencyinjection.domain.Customer;
import com.springfundamentals.dependencyinjection.domain.MailingAddress;

import java.util.HashMap;
import java.util.Map;

public class InMemoryDatabase {

    public static final Map<String, Customer> DATABASE = new HashMap<>() {{
        put("1", new Customer("1", "Albus Dumbledore", new MailingAddress("High Street 1", "Hogwarts"), "albus@hogwarts.edu"));
        put("2", new Customer("2", "Rubeus Hagrid", new MailingAddress("Hagrid's House", "Hogwarts"), "rubeus@hogwarts.edu"));
    }};
}
