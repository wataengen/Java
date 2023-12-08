public class BankSample3 {
    public static void main(String[] args) {
        GoodBank bank = new GoodBank();

        Deposit3 th1 = new Deposit3(bank);
        th1.start();

        Withdraw3 th2 = new Withdraw3(bank);
        th2.start();
    }
    
}
