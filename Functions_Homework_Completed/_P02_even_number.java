package Functions_Homework_Completed;
import java.util.*;


public class _P02_even_number {

    public static void evenNumber(int n)
    {
        if(n%2 == 0)
        System.out.println("Number is even");
        else
        System.out.println("Number is odd");
        
    }
    public static void main(String[] Agrs)
    {
        int n;
        Scanner sc= new Scanner (System.in);

        System.out.println("\t *** Program to check if Even number or not ***");
        System.out.println("Enter number: ");
        n=sc.nextInt();
        evenNumber(n);
    }
}
