public class GoodBank {
    private int balance = 0;
    public GoodBank(){
        this.balance = 0;
    }
    public synchronized void useATM(int money){
        while(balance + money < 0){
            try{
                wait();
            } catch(InterruptedException e){
            }
        }
    
        int b = balance;
        String category = "";
        if ( money >= 0 ){
            category = "預入れ";
        } else {
            category = "引出し";
        }
        System.out.println(category + "前の残高：" + b );
        b = b + money;
        System.out.println(category + "後の残高：" + b );
        balance = b;
        notify();    
    }
}
