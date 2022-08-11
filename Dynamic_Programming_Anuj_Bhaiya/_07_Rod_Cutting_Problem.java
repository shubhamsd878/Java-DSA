package Dynamic_Programming_Anuj_Bhaiya;

class _07_Rod_Cutting_Problem{
    public static void main(String[] args) {
        int length[] = {1,2,3,4,5,6,7,8};
        int price[] = {1,5, 6, 9, 11, 12, 14, 16};

        int[] dp = new int[ length.length + 1];

        int result = maxProfit( length, price, 4, 0, dp);

        System.out.println(result);

        for (int i : dp) {
            System.out.print(i + " ");
        }
    }

    public static int maxProfit( int length[], int price[], int rod, int j, int[] dp){
        
        if(j == length.length){
            return 0;
        }
        if(rod == 0){
            return 0;
        }

        // if( dp[j] != 0){
        //     return dp[j];
        // }

        int result = -1;

        for(int i = 0; i < length.length; i++){
            int res1 = 0, res2;
            if( rod - length[i] >= 0){
               res1 = price[i] + maxProfit(length, price, rod - length[i], j+1, dp);    //price added here
            }

            res2 = maxProfit(length, price, rod, j + 1, dp);

            if( result < Math.max( res1, res2)){
                result = Math.max(res1, res2);
            }
        }

        return dp[j] = result;

    }

}