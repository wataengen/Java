public class BankSample2 {
    public static void main(String[] args) {
        BadBank2 bank = new BadBank2();

        Deposit2 th1 = new Deposit2(bank);
        th1.start();

        Withdraw2 th2 = new Withdraw2(bank);
        th2.start();
    }
}