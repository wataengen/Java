class Loop3 {
    public static void main(String[] args){
        // Array.javaをfor文で書き換え
        int []score = new int[3];
        score[0] = 80;
        score[1] = 100;
        score[2] = 75;

        String[] name = {"中村", "村山", "寺島"};
        
        for (int i = 0; i < score.length; i++) {
            System.out.println(name[i] + "さん：" + score[i] + "点");
        }
        System.out.println("受験者数："+ score.length + "名");
    }
}
