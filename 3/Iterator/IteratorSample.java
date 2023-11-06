import java.util.ArrayList;
import java.util.Iterator;

public class IteratorSample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Java学習中！");
        list.add("継続して学習中");
        list.add("頑張ります！");

        Iterator<String> it = list.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
