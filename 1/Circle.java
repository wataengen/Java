class Circle {
    public static void main(String[] args){
        int radius = Integer.parseInt(args[0]);
        double pi = 3.141592;
        double area;

        area = radius * radius *pi;

        //小数点第3位以降を切り捨て
        area = (int) (area *100);
        area = area / 100;

        System.out.println("半径："+ radius);
        System.out.println("面積："+ area);
    }    
}
