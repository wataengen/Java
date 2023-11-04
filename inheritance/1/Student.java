public class Student extends Person {
    private int stuNo;

    public void setStuNo(int s) {
        stuNo = s;
    }
    public void displayStuNo() {
        System.out.println("学籍番号：" + stuNo);
    }
}
