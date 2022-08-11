// top - down approach
package Dynamic_Programming_Anuj_Bhaiya;

class _10_MCM_Matrix_chain_multiplication{
    public static void main(String[] args) {
        // int arr[] = {10, 20, 30, 40, 50};
        // int arr[] = {10, 20, 30, 40, 30};
        // int arr[] = {1, 2, 3, 4, 5};
        int arr[] = {4, 10, 3, 12, 20, 7};

        // int arr[] = {10,30,5,60};

        int dp[][] = new int[ arr.length][arr.length];

        int result = MCM(arr, 1, arr.length-1, dp );
        System.out.println( result );

        for(int i = 0; i<arr.length; i++){
            for(int j =0; j<arr.length; j++){
                System.out.print( dp[i][j] + "\t");
            }
            System.out.println();
        }
    }

    static int MCM(int[] arr, int i, int j, int[][] dp ){
        if( i == j){
            return 0;
        }

        if(dp[i][j] != 0){
            return dp[i][j];
        }
        
        int result = Integer.MAX_VALUE;

        for(int k = i; k <= j-1; k++){

                                                            // *********MOST IMPORTANT LINE - understand++ ****************
            int steps = ( arr[i - 1] * arr[k] * arr[j] ) + MCM(arr, i, k, dp) + MCM(arr, k+1, j, dp);

            result = Math.min( result, steps);

            // int temp1 = arr[i-1] * MCM(arr, i, k);
            // int temp2 = arr[k] * MCM(arr, k+1, j);

            // int temp = temp1 + temp2;

            // if (result > temp){
            //     result = temp;
            // }
        }

        return dp[i][j] = result;
    }

}