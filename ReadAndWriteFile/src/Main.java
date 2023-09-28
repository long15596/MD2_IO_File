import java.util.List;

public class Main {
    public static void main(String[] args) {
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        List<Integer> numbers = readAndWriteFile.readFile("ReadFileExample/numbers.txt" );
        int maxValue = FIndMaxValue.findMax(numbers);
        readAndWriteFile.writeFile("ReadAndWriteFile/result.txt", maxValue);
    }
}