package classes.factories;

import classes.Address;
import classes.ContactDetails;
import classes.model.ContactListFactory;

public class UKContactListFactory implements ContactListFactory {
    private final String PREFIX = "+44 ";

    @Override
    public Address createAddress(String streetNumber, String streetName,
                                 String apartmentOrUnit, String city, String province,
                                 String autonomousCommunity, String county, String postalCode) {
        return new Address("","","",
                        "","","","");
    }

    @Override
    public ContactDetails createContactDetails(String phoneNumber) {
        return new ContactDetails(PREFIX + phoneNumber);
    }
}
