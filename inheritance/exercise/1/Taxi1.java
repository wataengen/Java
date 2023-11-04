public class Taxi1 extends Car1{
    private int price = 0;
    public void start () {
        price = price + 420;
    } 
    public void run () {
        price = price + 80;
    }
    public void display() {
        System.out.println("料金は"  + price + "円です。");
    }
}
