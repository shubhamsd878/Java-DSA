package Array_Homework_Completed;

import java.util.*;
class _01_Input_name{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        String names[] = new String[10];
        System.out.println("\t***Program to print Array input Names***");

        //Taking number of students names to be inserted
        System.out.println("Enter number of Students Names to be inserted (max limit: 10): ");
        int n=sc.nextInt();
        
        //Taking names as input
        for(int i=0; i<n; i++)
        {
            System.out.print("Enter name of student "+(i+1)+": ");
            names[i]=sc.next();
            System.out.println();
        }

        //Output names
        for(int i=0; i<5; i++)
        {
            System.out.print("Name of student "+(i+1)+" : "+names[i]);
            System.out.println();
        }
        
    }
}