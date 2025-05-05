package factories;

import classes.Address;
import classes.ContactDetails;
import model.ContactListFactory;

public class UKContactListFactory implements ContactListFactory {
    private final String PREFIX = "+44 ";
    private final String COUNTRY = "France";

    public UKContactListFactory() {
    }

    @Override
    public Address createAddress(String streetNumber, String streetName,
                                 String apartmentOrUnit, String city, String province,
                                 String autonomousCommunityOrCounty, String zipCode) {
        return new Address(streetNumber, streetName,
                apartmentOrUnit, city, province,
                autonomousCommunityOrCounty, zipCode, COUNTRY);
    }

    @Override
    public ContactDetails createContactDetails(String phoneNumber) {
        return new ContactDetails(PREFIX + phoneNumber);
    }
}
