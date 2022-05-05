package String;
import java.util.*;
public class _07_Integer_toString {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("\t ***  Program to convert int datatype to string using Integer.toString method***");
        System.out.println("Enter number: ");
        int number=sc.nextInt();
        String sentence=Integer.toString(number);
        System.out.println("int datatype successsfully converted to string: " +sentence);
    }   
}
