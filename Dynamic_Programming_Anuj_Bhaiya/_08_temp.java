// Greedy Solution
// with dp[] -- not working
package Dynamic_Programming_Anuj_Bhaiya;

public class _08_temp {
    public static void main(String[] args) {
        int length[] = {1,2,3,4,5,6,7,8};
        int price[] = {1,5, 6, 9, 11, 12, 14, 16};

        int[] dp = new int[ length.length + 1];

        int result = maxProfit( length, price, 8, dp, 8);

        System.out.println(result);

        for (int i : dp) {
            System.out.print(i + " ");
        }
    }

    public static int maxProfit( int length[], int price[], int rod, int[] dp, int i){
        
        if(rod == 0 || !(i > 0)){
            return 0;
        }

        if( rod >= length[i - 1]){

            return dp[i] = Math.max( price[i - 1] + maxProfit(length, price, rod - length[i - 1], dp, i), maxProfit(length, price, rod, dp, i-1));
        }

        return dp[i] = maxProfit(length, price, rod, dp, i-1);

    }

}
