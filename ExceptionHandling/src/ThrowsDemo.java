
import java.io.FileReader;
import java.io.IOException;

public class ThrowsDemo {
    public static void main(String[] args) {
        try{
            readfile();
        }
        catch (IOException e){
            System.out.println("File not found.");
        }
    }

    private static void readfile () throws IOException {
        FileReader fr = new FileReader("abc.text");

    }
}
