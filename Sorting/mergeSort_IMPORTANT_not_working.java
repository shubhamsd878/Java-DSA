package Sorting;
class mergeSort_IMPORTANT_not_working{
    public static void mergeSort(int arr[],int l,int r){
        if(l<r){
            int mid = (l+r)/2;
            
            mergeSort(arr, l, mid);
            mergeSort(arr, mid+1, r);

            merge(arr ,l , mid, r);

        }
    }

    public static void merge(int arr[], int l, int mid, int r){
        int n1 = mid - l + 1;
        int n2 = r - mid;

        System.out.println(n1);
        int a[] = new int[n1];
        int b[] = new int[n2];
        
        for(int i =0; i<n1; i++ ){
            a[i] = arr[l + i];
        }
        
        for(int i = 0; i<n2; i++ ){
            b[i] = arr[mid + 1 + i];
        }

        int i=0, j=0, k=l;
        while(i < n1 && j < n2){
            if(a[i] < b[i]){
                arr[k] = a[i];
                i++;
                k++;
            }
            else{
                arr[k] = b[j];
                j++;
                k++;
            }
        }
        while(i < n1){
            arr[k] = a[i];
            i++;
            k++;
        }
        while(j < n2){
            arr[k] = b[j];
            j++;
            k++;
        }
    }
    
    public static void printArr(int arr[]){
        for(int i = 0; i < arr.length - 1; i++){
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args){
        int arr[] = {6,3,9,5,2,8,7,1};
        for(int i=0; i<9; i++){
            System.out.println(arr[i]);
        }
        mergeSort(arr,0 , arr.length);
        // System.out.println(arr[1]);
        printArr(arr);
        }
    }