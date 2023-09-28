package dto;

import country.Country;

import javax.imageio.IIOException;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWrite {
    File file = new File("country.cvs");
    public void writeFile(List<Country> list) {
        try {
            FileWriter writer = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            String line = "";
            for (Country country: list) {
                line += country.getId() + "," + country.getCode() + "," + country.getName();
            }
            bufferedWriter.write(line);
            bufferedWriter.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public List<Country> readFile() {
        List<Country> list = new ArrayList<>();
        try {
            FileReader reader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(reader);
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                String[] data = line.split(",");
                Country country = new Country(data[0],data[1]);
                list.add(country);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return list;
    }
}
