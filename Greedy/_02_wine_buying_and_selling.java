package Greedy;

public class _02_wine_buying_and_selling {
    public static void main(String[] args) {
        int wine[] = {5, -4, 1, -3, 1};

        System.out.println( wineSelling(wine, wine.length) );
    }

    static int wineSelling( int[] wine, int n){

        // 1 - selling and buying pointer to start
        int s = 0, b =0;

        int ans = 0;

        while( s < n && b < n){

            // b pointer to first buying index
            while( wine[b] <= 0 ){
                b++;

                if( b >= n ){
                    return ans;
                }
            }  

            // s pointer to first selling index
            while( wine[s] >= 0 ){
                s++;

                if( s >= n ){
                    return ans;
                }
            } 

            // now b pointing to buying index & s pointing to selling
            // performing main operation

            // kharidne wala jyada h : b > s
            if( Math.abs( wine[b] ) >= Math.abs( wine[s] ) ){

                ans = ans +  ( Math.abs( wine[s] ) * Math.abs( s - b ) );
                wine[b] = wine[b] + wine[s] ;  // 5 + (-5)
                wine[s] = 0;

            }
            // bechne wala jyada h == s > b
            else{

                // ans = ans +  ( Math.abs(wine[b] ) * Math.abs( b -s ) );

                ans = ans + (wine[b] * Math.abs( b- s));

                wine[s] = wine[s] + wine[b] ;       // -5 + 3 = -2
                wine[b] = 0;

            }

        }

        return ans;
    }
}