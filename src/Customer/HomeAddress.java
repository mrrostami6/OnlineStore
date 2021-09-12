package Customer;

public class HomeAddress {
    private String countryName;
    private String stateName;
    private String streetName;
    private String zipCode;

    public HomeAddress(String countryName, String stateName, String streetName, String zipCode) {
        this.countryName = countryName;
        this.stateName = stateName;
        this.streetName = streetName;
        this.zipCode = zipCode;
    }

    @Override
    public String toString() {
        return "CountryName : " + countryName +
                "\nStateName : " + stateName +
                "\nStreetName : " + streetName +
                "\nZipCode : " + zipCode ;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
}
