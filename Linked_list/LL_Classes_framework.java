import java.util.*;                 //* includes everything

public class LL_Classes_framework{
    public static void main(String args[]){
        //linked list declaration syntax:
        LinkedList <String> list = new LinkedList<String> ();

        // addFirst, addLast, add :
        list.addFirst("I");
        list.addFirst("Hello!");
        list.addLast("am");
        list.add("a");
        list.addLast("Linked list");
        list.addLast("by");
        list.add("using");
        list.addLast("Classes");
        list.addLast("Framework");

        // print list and return size():
        System.out.println(list);
        System.out.println(list.size());

        // remove() :
        list.removeFirst();
        list.remove(6);
        list.remove(6);
        list.remove(5);
        list.removeLast();

        System.out.println(list);
        System.out.println(list.size());
    }
}