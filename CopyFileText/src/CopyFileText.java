import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CopyFileText{
    public List<String> readFile(String filePath) {
        List<String> text = new ArrayList<>();
        try {
            File file = new File(filePath);
           if (!file.exists()) {
               throw new FileNotFoundException();
           }
            BufferedReader reader = new BufferedReader(new FileReader(file));
           String line;
           while ((line = reader.readLine()) != null) {
               text.add(line);
           }
        }catch (Exception e) {
            System.out.println("File không tồn tại");
        }
        return text;
    }
    public void writeFile(List<String> text,String filePath){
        try {
            FileWriter writer = new FileWriter(filePath);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            StringBuilder line = new StringBuilder();
            for (String s: text) {
                line.append(s).append("\n" );
            }
            bufferedWriter.write(String.valueOf(line));
            bufferedWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
