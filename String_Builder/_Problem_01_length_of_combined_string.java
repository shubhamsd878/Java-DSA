package String_Builder;
import java.util.*;


public class _Problem_01_length_of_combined_string{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("\t*** Program to calculate length of multiple combined string***");
        System.out.println("Enter no. of string to insert");
        int  size=sc.nextInt();
        // String sentence[] = new String[size];
        StringBuilder sb[]= new StringBuilder[size];
        for(int i=0; i< size; i++)
        {
            sb[i]= sc.next();
        }
        String result="";
        for(int i=0; i< size; i++)
        {
            result += sb[i];
        }
        System.out.println("Result String: " + result);
        System.out.println("Length: " + result.length());
    }
}