public class Withdraw3 extends Thread{
    private GoodBank bank;

    public Withdraw3(GoodBank bank) {
        this.bank = bank;
    }
    public void run(){
        for(int i = 0; i < 3 ; i++) {
            bank.useATM(-1000);
            try {
                Thread.sleep((int)(Math.random() * 100));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
