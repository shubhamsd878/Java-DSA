package String_Builder;
import java.util.*;

public class _01_charAt {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String: ");
        StringBuilder sentence= sc.next();
        System.out.println("Enter index to print character at: ")
        int i=sc.nextInt();
        System.out.println("Character at" +i+ "index is :" +sentence.charAt(i));
    }
}
