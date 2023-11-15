import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class TWR1 {
    public static void main(String[] args) {
        FileReader fr = null;
        BufferedReader br = null;
        try {
            fr = new FileReader("name.txt");
            br = new BufferedReader(fr);
            System.out.println("1: " + br.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null) br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    
}
