public class Car1 {
    private int no;
    private int speed;

    public void setNo(int n) {
      no = n;
    }
    public void run(int s) {
        speed = s;
    }
    public void brake() {
        speed = 0;
    }
    public void brake(int s) {
        speed = speed - s;
    }
    public void display() {
        System.out.println("ナンバー" + no + "の速度は" + speed + "です。");
    }
}
