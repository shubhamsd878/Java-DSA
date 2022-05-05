//IMPORTANT thing is sorting using Collection Framework
import java.util.ArrayList;
import java.util.Collections;

public class _IMP_ArrayList {
    public static void main(String[] args){

        // -------------- Integer ---------------
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        list.add(1);
        list.add(2);
        list.add(3);

        int get = list.get(2);  //Index
        
        list.add(2, 10);    //Index, Element
        
        list.remove(0);

        int size = list.size();

        // System.out.println(get);
        System.out.println(size);

        // Sorting using collection framework
        Collections.sort(list);


        System.out.println(list);
        

        //traverse using for loop
        // for(int i = 0; i<list.size(); i++){
        //     System.out.print(list.get(i) + " ");
        // }



        // --------------- String ----------------
        
        // ArrayList<String> listString = new ArrayList<String>();
        
        // listString.add("first");
        // listString.add("second");
        // listString.add("third");
        
        // System.out.println(listString);
        
        
        
        // --------------- Boolean ---------------

        // ArrayList<Boolean> listBoolean = new ArrayList<Boolean>();
        // listBoolean.add(true);
        // listBoolean.add(false);
        // listBoolean.add(true);

        // System.out.println(listBoolean);
    }
}
