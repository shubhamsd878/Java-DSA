// x^n java last q. --> https://www.youtube.com/watch?v=5Boqfjissv0&list=PLfqMhTWNBTe3LtFWcvwpqTkUSlB32kJop&index=20&ab_channel=ApnaCollege
// logic in the bottom makes 
// O(log n) --> stack height (log n)

package Intermediate_Questions;

public class _04_x_pow_n {
    static int calcPow(int x, int n){
        // base case 1
        if( n==0 ){
            return 1;
        }
        // base case 2
        if( x == 0 ){
            return 0;
        }

        // if n is even
        if( n%2 == 0)
            return calcPow(x, n/2) * calcPow(x, n/2);

        else{  // n is odd
            return calcPow(x, n/2) * calcPow(x, n/2) * x;
        }
    }

    public static void main(String[] args){
        int result = calcPow(2, 5);

        System.out.println(result);
    }   
}


// if n is even then  x^n  ==  x^(n/2) * x^(n/2)
// if n is odd then  x^n  ==  x^(n/2) * x^(n/2) * x