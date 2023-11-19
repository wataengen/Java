public class ThreadSample {
    public static void main(String[] args) {
        CountUp th1 = new CountUp();
        CountDown th2 = new CountDown();
        th1.start();
        th2.start();
    }
}
