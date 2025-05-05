package factories;

import classes.Address;
import classes.ContactDetails;
import model.ContactListFactory;

public class FRContactListFactory implements ContactListFactory {
    private final String PREFIX = "+33 ";
    private final String COUNTRY = "France";
    @Override
    public Address createAddress(String streetNumber, String streetName,
                                 String apartmentOrUnit, String city, String province,
                                 String autonomousCommunityOrCounty, String postalCode) {
        return new Address(streetNumber, streetName,
                apartmentOrUnit, city, province,
                autonomousCommunityOrCounty, postalCode, COUNTRY);
    }

    @Override
    public ContactDetails createContactDetails(String phoneNumber) {
        return new ContactDetails(PREFIX + phoneNumber);
    }
}
