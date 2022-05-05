package Functions_Homework_Completed;

import java.util.*;

public class _P01_prime_number{

    public static void primeNumber(int n)
    {
        int check=2;
        
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
            {
                // check =0;
                System.out.println("Number is not prime");
                return;
            }
            
            else{
                // check =1;
                System.out.println("Number is prime");
                return;
            }

            // if(check==0)
            // System.out.println("Number is not prime");
            // if(check==1)
            // System.out.println("Number is prime");
            
        }
    }
    public static void main(String[] agrs)
    {
        int n;
        Scanner sc= new Scanner(System.in);

        System.out.println("\t *** Program to check if Prime number or not ***");
        System.out.println("Enter number: ");
        n=sc.nextInt();
        primeNumber(n);
    }

}