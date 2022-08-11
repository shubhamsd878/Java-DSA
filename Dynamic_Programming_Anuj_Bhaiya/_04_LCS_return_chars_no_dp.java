// Using tabulation and bottom up Approach i.e. we fill whole/full matrix in this.
// using for loop not recursive 
// no dynamic programming

package Dynamic_Programming_Anuj_Bhaiya;

import java.util.Arrays;

public class _04_LCS_return_chars_no_dp {
    public static void main(String[] args) {
        String s1 = new String("ABCAB");
        String s2 = new String("AECB");

        int m = s1.length(), n = s2.length();

        int dp[][] = new int[m+1][n+1];

        
        LCS(s1, s2, m, n, dp);
        
        
        for(int i = 0; i<=m; i++){
            for(int j = 0; j<=n; j++){
                System.out.print( dp[i][j] + "\t");
            }
            System.out.println();
        }

        printChars(dp, m, n, s1);
    
    }

    static void printChars(int[][] dp, int m, int n, String s1){
        int i = dp[m][n];
        char[] ch = new char[ i ];
        
        help(dp, m, n, s1, i - 1, ch);

        for(int j = 0; j<ch.length; j++){
            System.out.println( ch[j]);
        }

    }

    static void help(int[][] dp, int m, int n, String s1, int i, char[] ch){
        if(m == 0 || n == 0 ){
            return;
        }

        else if( dp[m][n] == dp[m-1][n] ){
            help(dp, m - 1, n, s1, i, ch);
        }

        else if( dp[m][n] == dp[m][n-1] ){
            help(dp, m, n - 1, s1, i, ch);
        }

        else if( dp[m][n] != dp[m-1][n] && dp[m][n] != dp[m][n-1] ){
            ch[i] = s1.charAt(m-1);
            i--;
            help(dp, m - 1, n -1 , s1, i, ch);
        }

    }

    static void LCS(String s1, String s2, int m, int n, int[][] dp){
        if(m == 0 || n == 0){
            return;
        }

        for(int i = 1; i <= m; i++){
            for( int j = 1; j<= n; j++){

                if( s1.charAt( i - 1 ) == s2.charAt( j-1) ){
                    dp[i][j] = dp[i-1][j-1] + 1;
                }

                else{
                    dp[i][j] = Math.max( dp[i-1][j], dp[i][j-1]);
                }

            }
        }
        
    }

}