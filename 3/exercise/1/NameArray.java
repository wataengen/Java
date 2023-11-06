public class NameArray {
    public static void main(String[] args) {
        String[] names = {"桜井", "田原", "中川", "中村"};
        String search = args[0];
        boolean result = false;

        for(int i = 0; i < names.length; i++) {
            if(names[i].equals(search)) {
                result = true;
            }
        }

        if(result){
            System.out.println(search + "さんは含まれています");
        } else {
            System.out.println(search + "さんは含まれていません");
        }
    }
}
