package Function_Exercise_1_Completed;

import java.util.*;
class _02_odd_numbers_upto_n{
    public static void oddNumber(int n)
    {
        // if( n >0)
        // {
        //     System.out.println("1");
        // }
        for(int i=0; i<=n; i++)
        {
            if(i%2==1)
            {
                System.out.println(i);
            }
        }
    }
    public static void main(String[] agrs)
    {
        int n;
        Scanner sc= new Scanner(System.in);
        System.out.println("\t *** Program to print odd numbers upot n ***");
        System.out.println("Enter value of n: ");
        n=sc.nextInt();
        oddNumber(n);
    }

}