import java.io.IOException;

public class StandardIO {
    public static void main(String[] args) {
        try {
            int data;
            while ((data = System.in.read()) != -1) {
                System.out.print((char) data);                
            } 
        } catch(IOException e) {
                System.err.println("エラーが発生しました");
        }
    }
}
