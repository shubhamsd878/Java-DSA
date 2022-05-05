//Don't know if the x=0, n=0, then still result=1, but it must be 0, because of the logic.

package Function_Exercise_1_Completed;
import java.util.*;
public class _08_IMPORTANT_raised_to_the_power {
    public static void raisedToThePower(int x, int n)
    {
        int result=1;
        // if(n==0)
        // {
        //     System.out.println("Output: "+1);
        //     return;

        for(int i=0;i<n;i++)
        {
            result=result*x;
        }
        System.out.println("Output: "+result);
    }
    public static void main(String[] args)
    {
        int x,n;
        Scanner sc= new Scanner(System.in);
        System.out.println("\t***Program to find x^n entered by the user*** ");
        
        System.out.println("Enter value of x: ");
        x=sc.nextInt();
        
        System.out.println("Enter value of n: ");
        n=sc.nextInt();

        raisedToThePower(x,n);
    }   
}
