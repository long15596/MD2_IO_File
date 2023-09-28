import country.Country;
import manager.CountryManager;

public class Main {
    public static void main(String[] args) {
        CountryManager countryManager = new CountryManager();
        countryManager.addCountry(new Country("Việt Nam", "Vn"));
    }
}