package Dynamic_Programming_Anuj_Bhaiya;

public class _06_Minimum_Edit_Distance_with_dp_array_for_loop {
    public static void main(String[] args) {
        // String str1 = "DIG", str2 = "DOG";                   //1
        String str1 = "ABCAB", str2 = "EACB";                   //3

        int m = str1.length(), n = str2.length();

        int[][] dp = new int[m+1][n+1];
        for(int i = 0; i <= m; i++){
           dp[i][0]= i;
        }
        for(int i = 0; i <= n; i++){
            dp[0][i]= i;
         }

        int result = minEditDistance( str1, str2, m, n, dp);

        System.out.println( result );

        for(int i = 0; i<=m; i++){
            for(int j = 0; j<=n; j++){
                System.out.print( dp[i][j] + "\t");
            }
            System.out.println();
        }
    }

    static int minEditDistance( String str1, String str2, int m, int n, int[][] dp){

        if( m == 0 ){
            return n;
        }

        if( n== 0){
            return m;
        }

        for(int i = 1; i <= m; i++){
            for(int j = 1; j <= n; j++ ){
                
                if( str1.charAt(i-1) == str2.charAt(j-1)){
                    dp[i][j] = dp[ i-1 ][j-1];
                }

                else{
                    dp[i][j] = 1 + Math.min( dp[i-1][j], Math.min( dp[i][j-1], dp[i-1][j-1] ));
                }
            }
        }


        return dp[m][n];
    }

}
