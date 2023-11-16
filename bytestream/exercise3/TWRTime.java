import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;

public class TWRTime {
    public static void main(String[] args) {
        try(FileReader fr = new FileReader("original.txt");
        BufferedReader br = new BufferedReader(fr);
        FileWriter fw = new FileWriter("copy1.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        ) {
            

            long t1 = System.currentTimeMillis();
            String msg = br.readLine();

            long t2 = System.currentTimeMillis();
            for (int i = 0; i < 100000; i++) {
                bw.write(msg);
                bw.newLine();
            }

            long t3 = System.currentTimeMillis();
            System.out.println("入力：" + (t2 - t1) + "ミリ秒");
            System.out.println("出力：" + (t3 - t2) + "ミリ秒");
            System.out.println("合計：" + (t3 - t1) + "ミリ秒");
        } catch(IOException e) {
            System.out.println("エラーが発生しました");
        } 
    }
}
