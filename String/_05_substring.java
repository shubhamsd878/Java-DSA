package String;
import java.util.*;
public class _05_substring {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("\t***Program to print part of string using substring method***");
        System.out.println("Enter string: ");
        String sentence=sc.nextLine();
        
        System.out.println("Enter starting index of String: ");
        int start=sc.nextInt();
        System.out.println("Enter starting index of String: ");
        int end=sc.nextInt();
        System.out.println(sentence.substring(start, end));
    }
}
