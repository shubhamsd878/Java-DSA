package Function_Exercise_1_Completed;
import java.util.*;
public class _10_Fibo_series_of_n_terms {
    public static void fibo(int n)
    {
        int fibo, fibo1=0, fibo2=1;
        System.out.println(fibo1);
        System.out.println(fibo2);
        for(int i=2; i<n; i++)
        {
            fibo=fibo1+fibo2;
            fibo1=fibo2;
            fibo2=fibo;
            System.out.println(fibo);
        }
    }
    public static void main(String[] args)
    {
        int n;
        Scanner sc= new Scanner(System.in);
        System.out.println("\t***Program to print Fibonacii series of n terms***");
        System.out.println("Enter value of n: ");
        n=sc.nextInt();
        fibo(n);
    }
}