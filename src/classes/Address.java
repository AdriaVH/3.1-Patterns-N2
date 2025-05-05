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
                   String autonomousCommunity, String postalCode) {
        this.streetNumber = streetNumber;
        this.streetName = streetName;
        this.apartmentOrUnit = apartmentOrUnit;
        this.city = city;
        this.province = province;
        this.autonomousCommunityOrCounty = autonomousCommunity;
        this.postalCode = postalCode;
    }
}
