package Functions_Homework_Completed;
import java.util.*;

public class _01_Function_Sum {
    public static int sum(int a,int b)
    {
        int sum=a+b;
        return sum;
    }

    public static void main(String[] args)
    {
        int a, b, csum;
        
        System.out.println("Enter two numbers: ");
        Scanner sc = new Scanner(System.in);
        a= sc.nextInt();
        b= sc.nextInt();
        System.out.println("Sum of a and b is: " + sum(a,b));
        // csum = sum( a, b);
        // System.out.println("Sum of two number is: " +csum);
    }

}
