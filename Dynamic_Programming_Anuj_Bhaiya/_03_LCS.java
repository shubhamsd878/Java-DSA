// LCS stands for Longest Common Subsequence

package Dynamic_Programming_Anuj_Bhaiya;

import java.util.Arrays;

public class _03_LCS {
    public static void main(String[] args) {
        String s1 = new String("ABCAB");
        String s2 = new String("AECB");

        int m = s1.length(), n = s2.length();

        int dp[][] = new int[m+1][n+1];
        for(int[] row:dp){
            Arrays.fill(row, -1);
        }


        int result = LCS(s1, s2, m, n, dp);

        System.out.println(result);
        
        for(int i = 0; i<=m; i++){
            for(int j = 0; j<=n; j++){
                System.out.print( dp[i][j] + "\t");
            }
            System.out.println();
        }
    

        // System.out.println( s1. + "" + s2);
        // s1.get
    }

    static int LCS(String s1, String s2, int m, int n, int[][] dp){
        if(m == 0 || n == 0){
            dp[m][n] = 0;
            return 0;
        }

        if( dp[m][n] != -1 ){
            return dp[m][n];
        }


        int result =0 , res1 = 0, res2;

        if( s1.charAt(m-1) == s2.charAt(n-1) ){
            result = LCS(s1, s2, m-1, n-1, dp);
            dp[m][n] = 1 + result;                          // ********* don't forget this line **********
            return 1 + result;
        }

        else{

            res1 = LCS(s1, s2, m-1, n, dp);
            res2 = LCS(s1, s2, m, n-1, dp);

            result = Math.max(res1, res2);
        }

        dp[m][n] = result;                          // add this line everywhere before all return statements
        
        return result;
    }

}
