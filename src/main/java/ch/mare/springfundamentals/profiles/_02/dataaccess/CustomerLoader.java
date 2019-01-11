package ch.mare.springfundamentals.profiles._02.dataaccess;

import ch.mare.springfundamentals.dependencyinjection.common.domain.Customer;

public interface CustomerLoader {

  Customer findById(String customerId);
}
