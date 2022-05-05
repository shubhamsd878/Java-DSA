package Functions_Homework_Completed;
import java.util.*;

class _02_Function_factorial 
{
    public static int factorial(int n)
    {
        if(n=0)
        return 1;
        
        else if(n<0)
        {
            System.out.println("Invalid number");
            return 0;
        }
        
        int fact=1;

        for(int i=n; i>=1; i--)
        {
            fact = fact*i;
        }
        return fact;
    }

     public static void main(String[] args)
     {
         int n;
         Scanner sc= new Scanner(System.in);

         System.out.println("\t *** Program to find Factorial ***");
         System.out.println("Enter number: ");
         n = sc.nextInt();
        //  n= factorial(n);
         System.out.println("Factorial of 5 = " + factorial(n) );
     }   
}