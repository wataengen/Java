class Echo {
    public static void main(String[] args){
        //コマンドラインの入力文字列を表示
        for (int i = 0; i < args.length; i++) {
            args[i] = args[i];
            System.out.println(args[i]);
        }
    }    
}
