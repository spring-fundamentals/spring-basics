package com.acme.customermasterdata.api;

public class CmdCustomerDto {

    private final String id;
    private final String name;
    private final String street;
    private final String city;
    private final String emailAddress;

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
