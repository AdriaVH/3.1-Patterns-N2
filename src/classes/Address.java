package classes;

public class Address {

    private String streetNumber;        // e.g., "10"
    private String streetName;          // e.g., "Downing Street", "Rue de la Paix"
    private String apartmentOrUnit;     // e.g., "A", "Flat 3B", "Appartement 12"

    private String city;                // e.g., "London", "Madrid", "Paris"
    private String postalCode;          // e.g., "SW1A 2AA", "28013", "75002"
    private String province;            // For Spain
    private String autonomousCommunityOrCounty; // For Spain
    private String country;            // e.g., "UK", "Spain", "France"

    public Address(String streetNumber, String streetName,
                   String apartmentOrUnit, String city, String province,
                   String autonomousCommunity, String postalCode, String country) {
        this.streetNumber = streetNumber;
        this.streetName = streetName;
        this.apartmentOrUnit = apartmentOrUnit;
        this.city = city;
        this.province = province;
        this.autonomousCommunityOrCounty = autonomousCommunity;
        this.postalCode = postalCode;
        this.country = country;
    }
    public Address(Address address) {
        this.streetNumber = address.getStreetNumber();
        this.streetName = address.getStreetName();
        this.apartmentOrUnit = address.getApartmentOrUnit();
        this.city = address.getCity();
        this.province = address.getProvince();
        this.autonomousCommunityOrCounty = address.getAutonomousCommunityOrCounty();
        this.postalCode = address.getPostalCode();
        this.country = address.getCountry();
    }

    public String getStreetNumber() {
        return streetNumber;
    }

    public String getStreetName() {
        return streetName;
    }

    public String getApartmentOrUnit() {
        return apartmentOrUnit;
    }

    public String getCity() {
        return city;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public String getProvince() {
        return province;
    }

    public String getAutonomousCommunityOrCounty() {
        return autonomousCommunityOrCounty;
    }

    public String getCountry() {
        return country;
    }


}
