public class Withdraw extends Thread {
    private BadBank bank;

    public Withdraw(BadBank bank) {
        this.bank = bank;
    }
    public void run() {
        for (int i = 0; i < 3; i++) {
            bank.useATM(-1000);
            try {
                Thread.sleep((int) (Math.random() * 100));
            } catch(InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    
}
