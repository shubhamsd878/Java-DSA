package String;
import java.util.*;
public class _03_charAt {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("\t***Program to print character by charAt method***");
        System.out.println("Enter String:");
        String sentence=sc.nextLine();
        System.out.println("Value of index you want to print: ");
        int i=sc.nextInt();
        System.out.println("Character at "+i+"index is: " + sentence.charAt(i));
    }   
}
