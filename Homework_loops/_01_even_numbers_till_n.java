import java.util.*;
public class _01_even_numbers_till_n {
    public static void main(String[] agrs)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter value of n upto you want to print numbers: ");

        int n= sc.nextInt();
        
        for(int i=1; i<n;i++)
        System.out.println(i);
    }
}