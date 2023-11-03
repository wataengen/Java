class NonObject {
    public static void main(String[] args){
        //データの入力
        int []score = {80, 100, 75, 90};
        String[] name = {"中村", "村山", "寺島", "須藤"};
        
        //データの表示
        for (int i = 0; i < score.length; i++) {
            System.out.println(name[i] + "さん：" + score[i] + "点");
        }
        System.out.println("受験者数："+ score.length + "名");
    }    
}
