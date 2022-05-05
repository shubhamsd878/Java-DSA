import java.util.*;
class temp {
  public static void main(String[] args) {
    ArrayList<String> list = new ArrayList<>();
    list.add("Aman");
    list.add("Shubendu");
    list.add("Shivaraj");
    System.out.println("is Ankush present: "+ list.contains("Ankush"));
    list.add("Ankush");
    list.add("Vishal");
    list.add("Nrupul");

    // list.remove(new String("Ankush"));

    for(int i=0; i<list.size(); i++){
      System.out.println(list.get(i));
    }
  }
}