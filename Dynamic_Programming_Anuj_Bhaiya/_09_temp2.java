// reference -->  https://www.interviewbit.com/blog/rod-cutting-problem/#:~:text=Given%20a%20rod%20of%20length,rod%20is%20cut%20up%20optimally.
package Dynamic_Programming_Anuj_Bhaiya;

public class _09_temp2 {
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
        
        if( rod == 0 || i==0){
            return 0;
        }

        if (dp[ rod] != 0){
            return dp[ rod];
        }

        int max_profit = -1;
        for( int j = 0; j < rod; j++){              // <n because if rod == 4 then no need to consider length 8 because logically rod of length 4 can not be cutted to make rod of length 

            max_profit = Math.max( price[j] + maxProfit(length, price, rod - length[j], dp, i), max_profit); 

        }

        return dp[rod] = max_profit;
    }

}
