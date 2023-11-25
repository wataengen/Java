public class DispChars {
    public static void main(String[] args) {
        DispThread th1 = new DispThread('+');
        DispThread th2 = new DispThread('-');
        DispThread th3 = new DispThread('*');
        th1.start();
        th2.start();
        th3.start();
    }
    
}
