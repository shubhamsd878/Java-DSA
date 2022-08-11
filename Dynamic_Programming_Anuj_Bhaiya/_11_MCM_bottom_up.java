package Dynamic_Programming_Anuj_Bhaiya;

public class _11_MCM_bottom_up {
    public static void main(String[] args) {
        // int arr[] = {10, 20, 30, 40, 50};
        // int arr[] = {10, 20, 30, 40, 30};
        int arr[] = {1, 2, 3, 4, 5};
        // int arr[] = {4, 10, 3, 12, 20, 7};

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

    static int MCM(int arr, int i, int j){
        if( i == j){
            return 0;
        }

        // for(int k = i;)

    }

}