class StuSample3 {
    public static void main(String[] args){
        Student3 stu1 = new Student3("菅原");
        Student3 stu2 = new Student3("村山",  75, 100);

        stu1.setScore(90,80);
        stu1.display();
        stu2.display();
    }
}
