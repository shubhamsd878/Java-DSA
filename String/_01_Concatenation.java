package String;
import java.util.*;
public class _01_Concatenation{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("\t***Program for String Concatenation***");
        System.out.println("Enter 1st String:");
        String s1= sc.nextLine();
        System.out.println("Enter 2nd String:");
        String s2= sc.nextLine();

        String result=s1 +s2;
        System.out.println("Concatenated Result: " +result);
    }
}