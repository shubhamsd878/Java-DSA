package Function_Exercise_1_Completed;
import java.util.*;
public class _09_IMPORTANT_greatest_common_divisor {
    public static int greatestCommonDivisor(int n1, int n2)
    {
        int temp;

        if(n1>n2)
        temp=n1;
        else
        temp=n2;

        for(;temp>0;temp--)
        {
            if(n1%temp==0 && n2%temp==0)
            return temp;
        }
        return 0;
    }
    public static void main(String[] args)
    {
        int n1, n2;
        Scanner sc= new Scanner(System.in);
        System.out.println("\t***Program to find greatestCommonDivisor***");
        System.out.println("Enter two numbers: ");

        n1=sc.nextInt();
        n2=sc.nextInt();

        System.out.println("GCD of " +n1+" & "+n2+" is: " +greatestCommonDivisor(n1,n2) ); 
    }
}
