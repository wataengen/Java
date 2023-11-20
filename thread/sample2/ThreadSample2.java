public class ThreadSample2 {
    public static void main(String[] args) {
        CountUp2 r1 = new CountUp2();
        CountDown2 r2 = new CountDown2();
        Thread th1 = new Thread(r1);
        Thread th2 = new Thread(r2);
        th1.start();
        th2.start();
    }
}
