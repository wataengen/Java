import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;

public class FilterStream {
    public static void main(String[] args) {
        FileReader fr = null;
        FileWriter fw = null;
        BufferedReader br = null;
        BufferedWriter bw = null;
        try {
            fr = new FileReader("name.txt");
            br = new BufferedReader(fr);
            fw = new FileWriter("message2.txt");
            bw = new BufferedWriter(fw);

            String name = br.readLine();

            String msg = "Hello, " + name + "!";
            for (int i = 0; i < 5; i++) {
                bw.write(msg);
                bw.newLine();
            }
            bw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fr != null) fr.close();
                if (fw != null) fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    
}
