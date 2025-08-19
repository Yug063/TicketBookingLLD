public class City {
    private String cityName;
    private String cityPinCode;

    // Constructor
    public City(String cityName, String cityPinCode) {
        this.cityName = cityName;
        this.cityPinCode = cityPinCode;
    }

    // Getter and Setter for cityName
    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    // Getter and Setter for cityPinCode
    public String getCityPinCode() {
        return cityPinCode;
    }

    public void setCityPinCode(String cityPinCode) {
        this.cityPinCode = cityPinCode;
    }
}
