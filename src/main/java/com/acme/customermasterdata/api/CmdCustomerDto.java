package com.acme.customermasterdata.api;

import com.zuehlke.springfundamentals.dependencyinjection.domain.MailingAddress;

public class CmdCustomerDto {

  private String id;
  private String name;
  private String street;
  private String city;
  private String emailAddress;

  public CmdCustomerDto(String id, String name, String street, String city, String emailAddress) {
    this.id = id;
    this.name = name;
    this.street = street;
    this.city = city;
    this.emailAddress = emailAddress;
  }

  public String getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public String getStreet() {
    return street;
  }

  public String getCity() {
    return city;
  }

  public String getEmailAddress() {
    return emailAddress;
  }
}
