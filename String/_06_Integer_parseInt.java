package String;
import java.util.*;
public class _06_Integer_parseInt {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("\t***Program to convert string to number using 'Integer.parseInt' method***");
        System.out.println("Enter number in String: ");
        String sentence=sc.next();
        int number= Integer.parseInt(sentence);
        System.out.println("String successfully converted int datatype: " +number);
    } 
}
