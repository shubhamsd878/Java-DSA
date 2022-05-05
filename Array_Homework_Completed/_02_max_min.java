package Array_Homework_Completed;
import java.util.*;
public class _02_max_min {
    public static void main(String[] args)
    {
        int arr[] = new int[5] ;
        int min_value, max_value;
        // arr[] = {5,4,8,7,9};
        Scanner sc= new Scanner(System.in);

        System.out.println("\t *** Program to print max and min of array ***");
        // System.out.println("Enter 5 integers: ");
        // int min_value;

        System.out.println("Enter 5 values: ");
        
        
        for(int i=0; i<5;i++)
        {
            arr[i]=sc.nextInt();
        }

        //Initializing max_value & min_value
        min_value=arr[0];
        max_value=arr[0];
        for(int i=0; i<5;i++)
        {
            if(min_value>arr[i])
            {
                min_value=arr[i];
            }
            if(max_value<arr[i])
            {
                max_value=arr[i];
            }
        }
        System.out.println("MinimumValue: "+ min_value +"\nMaximum Value: " +max_value );
    }
}
