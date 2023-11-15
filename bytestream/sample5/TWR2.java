import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class TWR2 {
    public static void main(String[] args) {
        try ( FileReader fr = new FileReader("name.txt");
        BufferedReader br = new BufferedReader(fr);) {
            System.out.println("2: " + br.readLine());
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
    
}
