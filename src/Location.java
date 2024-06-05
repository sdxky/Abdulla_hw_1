public class Location {
    private String street;
    private String city;
    private String zipCode;

    public Location(String street, String city, String zipCode) {
        this.street = street;
        this.city = city;
        this.zipCode = zipCode;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getZipCode() {
        return zipCode;
    }

    @Override
    public String toString() {
        return "Location{" +
                "street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", zipCode='" + zipCode + '\'' +
                '}';
    }
}
