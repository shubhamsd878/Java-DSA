package Array_Homework_Completed;

import java.util.*;

public class _03_ADVANCE_check_Ascending_order {
    public static void main(String[] agrs)
    {
        int arr[] = new int[4];
        int tempArr[] = new int[4], temp;
        int check=0;

        Scanner sc= new Scanner (System.in);
        
        System.out.println("\t***Program to check whether array is sorted or not***");
        
        System.out.println("Enter 4 values: ");
        
        for(int i=0; i<4;i++)
        {
            arr[i] = sc.nextInt();
        }

        // !!!   Important! the below comment line COPIES ADDRESS. Don't use it
        //tempArr=arr;

        for(int i=0;i<4;i++)
        {
            tempArr[i]=arr[i];
        }

        for(int i=0; i<3;i++)
        {
            if(tempArr[i] > tempArr[i+1])
            {
                temp=tempArr[i];
                tempArr[i]=tempArr[i+1];
                tempArr[i+1]=temp;
            }
        }
        
        // The below comment checks memory address. don't use it
        // if(arr == tempArr)

        for(int i=0; i<4; i++)
        {
            if(arr[i] != tempArr[i])
            check=1;
        }

        if(check==0)
        System.out.println("Arrays are in Ascending order");
        else
        System.out.println("Arrays are not in Ascending order");

    }
}
