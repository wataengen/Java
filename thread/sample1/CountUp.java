public class CountUp extends Thread{
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("up: " + i);
        }
        
    }
}
