package Array_Searching_Sorting;
import java.util.*;
class linearSearch{
    // void linearSearch(int arr[],int n)
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of elements in in array: ");
        int n=sc.nextInt();
        int arr[]= new int[n];
        System.out.println("Enter array elements: ");
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        
        System.out.println("Enter element to search: ");
        int target=sc.nextInt();
        
        for(int i=0; i<n; i++){
            if(target ==  arr[i] )
            System.out.println(target+" is at: " +i+ " index");

        }
    }
}