// formula for no. of step  =  (2^n) -1
package Recursion.Intermediate_Questions;

public class _05_towerOfHanoi {
    static void towerOfHanoi(int n, String src, String helper, String dest){
        //base case
        if(n==1){
            System.out.println("Taking " + n + " from rod " + src + " to rod " + dest);
            return;
        }


        System.out.println("Taking " + n + " from rod " + src + " to rod " + dest);

        towerOfHanoi( n-1, src, dest, helper);


        towerOfHanoi( n-1, helper, src, dest);
        // towerOfHanoi(n, src, helper, dest);

    }

    public static void main(String[] args){
        int n =3;
        towerOfHanoi(n, "S", "H", "D");
    }
}