package Functions_Homework_Completed;

import java.util.*;

public class _P03_table_of_number {
    
    public static void Table(int n)
    {
     for(int i=1; i<=10; i++)
    //  System.out.println(n+" * "+i+" = "+n*i);
     System.out.println(n+ "*" +i+ "=" +n*i);   
    }
    public static void main(String[] agrs)
    {
        int n;
        Scanner sc = new Scanner(System.in);

        System.out.println("\t ***Program to print table of given number ");
        System.err.println("Enter number: ");
        n=sc.nextInt();
        Table(n);
    }
}
