package Recursion;

public class _02_Factorial {
    public static int printFactorial(int n){
        
        if(n == 1 || n==0)
        {
            return 1;
        }
        int factorial;
        // n=n-1;
        factorial = n * printFactorial(n-1);      //IMP
        return factorial;
    }
    public static void main(String[] args)
    {
        System.out.println(printFactorial(5));
    }
}