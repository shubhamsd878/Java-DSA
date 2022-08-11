// best explanation --> educative.io
// Working correctly but array printing in reverse also on solution available on sites
// beacause it working in reverse as first value with 50 has choice instead of having value 201

package Dynamic_Programming_Anuj_Bhaiya;

import java.util.Arrays;

class _02_01_knapsack{
    public static void main(String[] args) {
        int K = 10;
        int W[] = {1, 3, 4, 6};
        int V[] = {20, 30, 10, 50};
        // int K = 6;      // 7 -- 22, 6 -- 17
        // int W[] =  {5, 3, 2, 1}; //{1, 2, 3, 5};
        // int V[] =  {16, 10, 6, 1};//{1, 6, 10, 16};

        int[][] dp = new int[V.length + 1][K + 1];
        
        for( int[] row: dp){
            Arrays.fill(row, -1);
        }


        int result = knapSack(0, K, W, V, dp);

        System.out.println(result);


        // <--- below commented code: for calculating & printing all possible solutions in array--->

        // for(int i = 10; i>=10; i--){
        //     knapSack(0, i, W, V, dp);
        // }

        for ( int  i = 0; i < dp.length; i++) {
            for(int j = 0; j< dp[i].length; j++){
                System.out.print(dp[i][j] + "  ");
            }
            System.out.println();
        }
    }



    static int knapSack(int i, int K, int W[], int V[], int dp[][]){

        if (K == 0 || i >= W.length){
            return 0;
        }

        int result = 0;

        int res1 = 0, res2;

        if( dp[ i + 1][K] != -1){
            return dp[i+1][K];
        }

        if( K - W[i] >= 0){

            // ********** MOST IMPORTANT LINE **********
            res1 = V[i] + knapSack( i+1, K - W[i], W, V, dp );          // -- liya h    -- 1

        }

        // if K-W[i], can check for next indexes if weigths of upcoming was less was available

        res2 = knapSack( i+1, K , W, V, dp );                          // -- nhi liya  -- 0

        result = Math.max(res1, res2);
        dp[ i + 1 ][ K ] = result;

        // return result + V[i];                        // **** Mistake ***
        return result;
        
    }
}