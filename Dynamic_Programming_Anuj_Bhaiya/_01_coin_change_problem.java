package Dynamic_Programming_Anuj_Bhaiya;

import java.util.Arrays;

class _01_coin_change_problem{

    static int minCoins(int num, int coins[], int[] dp){
        if (num == 0) return 0;

        int Ans = Integer.MAX_VALUE;

        for(int i = 0; i <coins.length; i++){

            if( num - coins[i] >= 0){

                //dynamic programming if in memory
                if( dp[ num - coins[i]] != -1 ){
                    int subResult = dp[ num - coins[i]];
                    
                    if(Ans > subResult){
                        Ans = subResult;
                    }
                }

                // else not in memory
                else{
                    int subResult = minCoins(num - coins[i], coins, dp);

                    if(Ans > subResult){
                        Ans = subResult;
                    }
                }
            }
        }

        dp[num] = Ans + 1;
        return Ans + 1;
    }

    public static void main(String[] args){
        int coins[] = {7, 5, 1};
        int sum = 18;           // value to find the sum

        int dp[] = new int[sum + 1];
        Arrays.fill(dp, -1);
        dp[0] = 0;

        
        int result = minCoins(sum, coins, dp);
        System.out.println(result );

        for (int i = 0; i<dp.length; i++){
            System.out.println(i + " :- " + dp[i]);
        }

    }
}