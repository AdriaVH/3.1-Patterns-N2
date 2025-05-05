package classes.model;

import classes.Address;
import classes.ContactDetails;

public interface ContactListFactory {
    Address createAddress(String streetNumber, String streetName,
                          String apartmentOrUnit, String city, String province,
                          String autonomousCommunity, String county, String postalCode);
    ContactDetails createContactDetails(String phone);
}
