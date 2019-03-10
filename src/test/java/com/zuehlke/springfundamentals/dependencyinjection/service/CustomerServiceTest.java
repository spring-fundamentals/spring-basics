package com.zuehlke.springfundamentals.dependencyinjection.service;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import com.zuehlke.springfundamentals.dependencyinjection.dataaccess.CustomerLoader;
import com.zuehlke.springfundamentals.dependencyinjection.domain.Customer;
import com.zuehlke.springfundamentals.dependencyinjection.domain.MailingAddress;
import org.junit.Test;

public class CustomerServiceTest {

/*  @Test
  public void customerHasEmailAddress_deactivate_emailSent() {
    CustomerLoader customerLoader = mock(CustomerLoader.class);
    doReturn(new Customer("1", "testcustomer", mock(MailingAddress.class), "test@customer.de")).when(customerLoader).findById(anyString());
    EmailService emailService = mock(EmailService.class);
    PostalService postalService = mock(PostalService.class);
    CustomerService customerService = new CustomerService(customerLoader, emailService, postalService);

    customerService.deactivateCustomer("1");

    verify(emailService, times(1)).send(anyString(), anyString(), anyString());
    verify(postalService, times(1)).sendLetter(any(), anyString());
  }

  @Test
  public void customerHasNpEmailAddress_deactivate_noEmailSent() {
    CustomerLoader customerLoader = mock(CustomerLoader.class);
    doReturn(new Customer("2", "testcustomer2", mock(MailingAddress.class), "")).when(customerLoader).findById(anyString());
    EmailService emailService = mock(EmailService.class);
    PostalService postalService = mock(PostalService.class);
    CustomerService customerService = new CustomerService(customerLoader, emailService, postalService);

    customerService.deactivateCustomer("2");

    verify(emailService, never()).send(anyString(), anyString(), anyString());
    verify(postalService, times(1)).sendLetter(any(), anyString());
  }*/
}