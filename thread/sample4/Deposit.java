public class Deposit extends Thread {
    private BadBank bank;

    public Deposit(BadBank bank) {
        this.bank = bank;
    }
    public void run() {
        for (int i = 0; i < 3; i++) {
            bank.useATM(1000);
            try {
                Thread.sleep((int) (Math.random() * 1000));
            } catch(InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    
}
