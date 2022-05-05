//*** MOST IMPORTANT one try yourself last homework question in apnaCollege lecture 6
package Patterns;

public class _12_MOST_IMPORTANT {
    public static void main (String[] args){
        int m = 5;
        // int spaces = m-1;
            for(int i=1; i<=m; i++){
                // int num = m ;
                for(int j = m-i; j > 0; j--){
                    System.out.print(" ");
                }

                // first part 
                for(int j = i; j > 0; j-- ){
                    System.out.print(j);
                }

                // second part
                for(int j = 2; j <= i; j++){
                    System.out.print(j);
                }

                System.out.println();

        }
    }
}