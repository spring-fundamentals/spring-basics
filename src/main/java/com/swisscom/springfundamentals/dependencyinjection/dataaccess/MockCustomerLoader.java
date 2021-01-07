package com.swisscom.springfundamentals.dependencyinjection.dataaccess;

import com.swisscom.springfundamentals.dependencyinjection.domain.Customer;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile({"local", "default"})
@Primary
public class MockCustomerLoader implements CustomerLoader {

    @Override
    public Customer findById(String customerId) {
        return InMemoryDatabase.DATABASE.get(customerId);
    }
}
