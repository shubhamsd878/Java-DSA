package Recursion.Intermediate_Questions;

public class _08_check_if_sorted_array {
    
    static boolean isSorted(int[] arr, int idx){
        if(arr.length - 1 == idx + 1 || arr.length == 1){
            return true;
        }
        
        if(arr[idx] > arr[idx+1]){
            return false;
        }

        return isSorted(arr, idx+1);
    }
    public static void main(String args[]){
        // int[] a = {1, 2, 3, 4, 5};
        int[] a = {1, 2, 3, 5, 4};
        // int[] a = {2, 1};
        // int[] a = {2};
        
        System.out.println(isSorted(a, 0));

    }
}
