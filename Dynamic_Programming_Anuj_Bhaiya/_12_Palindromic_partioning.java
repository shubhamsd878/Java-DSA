// Greedy
// No dp[] 
package Dynamic_Programming_Anuj_Bhaiya;

class _12_Palindromic_partioning{
    public static void main(String[] args) {
        String str = "ABAB";
        // String str = "BABABCBADCD";
        // String str = "ababbbabbababa";

        int dp[][] = new int[str.length() +1][str.length() +1];

        int result = minPartition(str, 0, str.length() - 1, dp);

        System.out.println(result);

        for(int i = 0; i <= str.length(); i++){
            for(int j =0; j <= str.length(); j++){
                System.out.print( dp[i][j] + "\t");
            }
            System.out.println();
        }

    }

    // ************* Remember to only check for substring *************
    public static boolean isPalindrome( String str, int start_i, int end_i){
        
        boolean bool = true;

        if(start_i == end_i){
            return bool;
        }

        for( int i = start_i; i <= end_i; i++){
            if(str.charAt(i) != str.charAt( end_i-- ) ){
                bool = false;
                break;
            }

        }

        return bool;
    }

    public static int minPartition(String str, int start_i, int end_i, int[][] dp ){
        if( isPalindrome(str, start_i, end_i)){
            return 0;
        }

        if( start_i == end_i ){
            return 0;
        }

        if( dp[start_i + 1][end_i + 1] != 0){
            return dp[start_i + 1][end_i + 1];
        }

        int result = Integer.MAX_VALUE;
        int res1, res2;

        for(int k = start_i; k < end_i; k++ ){
            
            res1 = minPartition( str, start_i, k, dp );
            // res2 = minPartition( str, k+1, str.length()-1 );
            res2 = minPartition( str, k+1, end_i, dp );

            result = Math.min( result,  1 + res1 + res2);
        }

        return dp[start_i + 1][end_i + 1] = result;
    }
}