public class Car4 {
    private int no;
    static int count = 0;

    public Car4(){
        no = 0;
        count++;
        System.out.println("ナンバーなしを作りました。");
    }
    public Car4(int n){
        no = n;
        count++;
        System.out.println("ナンバー" + no + "を作りました。");
    }
    static void display() {
        System.out.println(count + "台作成済みです。");
    }
}
