package classes;

import java.util.Objects;

public class Contact {
    private String name;
    private String lastName;
    private ContactDetails details;
    private Address address;

    public Contact(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public void addInfo(Address address, ContactDetails details) {
        this.address = address;
        this.details = details;
    }

    public ContactDetails getDetails() {
        return new ContactDetails(details.getPhoneNumber());
    }

    public Address getAddress() {
        return new Address(address);
    }

    public String fullName() {
        return name + " " + lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Contact contact)) return false;
        return Objects.equals(name, contact.name) && Objects.equals(lastName, contact.lastName) && Objects.equals(details, contact.details) && Objects.equals(address, contact.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lastName, details, address);
    }
}

