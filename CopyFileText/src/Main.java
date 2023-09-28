import java.util.List;

public class Main {
    public static void main(String[] args) {
        CopyFileText copyFileText = new CopyFileText();
        List<String> text = copyFileText.readFile("ReadAndWriteFile/result.txt");
        copyFileText.writeFile(text, "CopyFileText/copytext.txt");
    }
}