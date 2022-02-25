package com.springfundamentals.dependencyinjection.domain;

public class Customer {

    private final String id;
    private final String name;
    private final MailingAddress mailingAddress;
    private final String emailAddress;

    public Customer(String id, String name, MailingAddress mailingAddress, String emailAddress) {
        this.id = id;
        this.name = name;
        this.mailingAddress = mailingAddress;
        this.emailAddress = emailAddress;
    }

    public boolean hasEmailAddress() {
        return emailAddress != null && !emailAddress.isEmpty();
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public MailingAddress getMailingAddress() {
        return mailingAddress;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", mailingAddress=" + mailingAddress +
                ", emailAddress='" + emailAddress + '\'' +
                '}';
    }
}
