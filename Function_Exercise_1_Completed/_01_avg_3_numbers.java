package Function_Exercise_1_Completed;

// package Exercise_1;

import java.util.*;
public class _01_avg_3_numbers {
    public static void Average(int a, int b, int c)
    {
        int avg;
        avg= (a + b + c)/3;
        System.out.println("Average of three numbers " +a+ " " +b+ " " +c+ " is : " +avg);
        // System.out.println(`Average of three number ${a} ${b} ${c} is ${avg}`);
    }

    public static void main(String[] agrs)
    {
        int a,b,c;
        Scanner sc= new Scanner(System.in);
        System.out.println("\t***Program to find average of 3 numbers*** ");
        System.out.println("Enter 3 numbers:");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        Average(a,b,c);
    }
}
