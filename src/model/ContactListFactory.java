package model;

import classes.Address;
import classes.ContactDetails;

public interface ContactListFactory {
    Address createAddress(String streetNumber, String streetName,
                          String apartmentOrUnit, String city, String province,
                          String autonomousCommunityOrCounty, String postalCode);
    ContactDetails createContactDetails(String phone);
}
