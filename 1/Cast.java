class Cast {
    public static void main(String[] args){
        int price = Integer.parseInt(args[0]);
        double rate = 0.1; //消費税率　10％
        int amount;

        amount = (int)(price * (1 + rate));
        System.out.println("税込金額：" + amount + "円");
    }
}
