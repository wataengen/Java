public class BankSample {
    public static void main(String[] args) {
        BadBank bank = new BadBank();

        Deposit th1 = new Deposit(bank);
        th1.start();

        Withdraw th2 = new Withdraw(bank);
        th2.start();
    }
}