import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileNotFoundException;

public class TWR3 {
    public static void main(String[] args) throws FileNotFoundException {
        FileReader fr = new FileReader("name.txt");
        BufferedReader br = new BufferedReader(fr);
        try (fr; br) {
            System.out.println("3: " + br.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
