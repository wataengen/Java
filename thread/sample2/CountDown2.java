public class CountDown2 implements Runnable {
    public void run() {
        for (int i = 5; i > 0; i--) {
            System.out.println("down: " + i);
        }
        
    }
}