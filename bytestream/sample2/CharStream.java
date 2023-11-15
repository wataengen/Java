import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharStream {
    public static void main(String[] args) {
        FileReader fr = null;
        FileWriter fw = null;
        try {
            fr = new FileReader("name.txt");
            fw = new FileWriter("message.txt");
            int data;
            String name = "";

            while((data = fr.read()) != -1) {
                name = name + (char)data;                
            }
            String msg = "Hello, " + name + "!";
            for (int i = 0; i < 5; i++) {
                fw.write(msg);
                fw.write("\n");
            }
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
