package Function_Exercise_1_Completed;
import java.util.*;

public class _03_greatest_integer {
    public static void greatestInteger(int a, int b)
    {
        if(a>b)
        System.out.println(a+" is greater than "+b);
        else if(b>a)
        System.out.println(b+" is greater than "+a);
        else if(a==b)
        System.out.println(a+ " & "+b+ " both are equal");
    }
    public static void main(String[] agrs)
    {
        int a, b;
        Scanner sc= new Scanner(System.in);
        System.out.println("\t***Program to find greatest integer out of two ***");
        System.out.println("Enter two number: ");
        a=sc.nextInt();
        b=sc.nextInt();
        greatestInteger(a,b);


    }
}
