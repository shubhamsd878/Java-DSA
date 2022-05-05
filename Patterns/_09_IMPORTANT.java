// IMPORTANT look at the algorithm
package Patterns;

public class _09_IMPORTANT {
    public static void main(String[] args){
        int m =8;
        for(int i = 0; i<m; i++){
            for(int j = 0; j <= i; j++){
                // if i + j == even --> 1, else 0
                if((i + j) % 2 == 0 ){
                    System.out.print(" 1 ");
                }
                else{
                    System.out.print(" 0 ");
                }
            }
            System.out.println();
        }
    }
}
