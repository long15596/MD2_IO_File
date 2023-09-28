package manager;

import country.Country;
import dto.ReadAndWrite;

import java.util.List;

public class CountryManager {
    private List<Country> countryList;
    private ReadAndWrite readAndWrite;
    public CountryManager(){
        readAndWrite = new ReadAndWrite();
        countryList = readAndWrite.readFile();
    }

    public void addCountry(Country country) {
        countryList.add(country);
        readAndWrite.writeFile(countryList);
    }
    public List<Country> getCountryList() {
        return this.countryList;
    }
}
