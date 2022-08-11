// matrix rotation --> 2 steps: transpose --> reverse each row
package _2_d_Arrays;

class _03_arrrix_Rotation{
    public static void rotatedarrrix(int arr[][], int n){

        int temp;
        for( int i=0; i < n;i++){ 
            for( int j=0;j< n;j++)
            {
                if(i == j){                         //MOST important to find transpose
                    break;
                }
                temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        for(int i = 0; i < n; i++){
            for(int j =0; j < n; j++){
                if(j >= n-1-j){
                    break;
                }
                temp = arr[i][j];
                arr[i][j] = arr[i][n-j-1];                          // -----IMPORTANT
                arr[i][n-j-1] = temp;                               // -----IMPORTANT
            }
        }

        for(int i = 0; i<n; i++){
            for(int j= 0; j<n; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        

    }
    public static void main(String[] args) {
        int arr[][] = {{1,2,3}, {4,5,6}, {7,8,9}};
        for(int i = 0; i< 3; i++){
            for(int j= 0; j< 3; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("length : " + arr.length);
        rotatedarrrix(arr, 3); 

        
    }   
}