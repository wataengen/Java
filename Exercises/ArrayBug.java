class ArrayBug{
  public static void main(String[] args){
    String[] name = new String[5];
    
    name[0] = "nakamura";
    name[1] = "tanaka";
    name[2] = "itinose";
    name[3] = "saiki";
    name[4] = "myoujin";
    
    System.out.println(name[0]);
    System.out.println(name[1]);
    System.out.println(name[2]);
    System.out.println(name[3]);
    System.out.println(name[4]);
  }
}
