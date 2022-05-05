package Patterns;

public class _13_MOST_IMPORTANT {
    public static void main(String[] args){
        int n = 4;
        // according to number of rows
        for(int i=1; i<=n; i++){
            // first part
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            // spaces

            // IMPORTANT
            for(int j = n; j>i; j-- ){
                System.out.print("  ");
            }

            //againt upper 2nd half
            for(int j = n; j>i; j-- ){
                System.out.print("  ");
            }

            //upper 2nd half 
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }

            // row-end next line
            System.out.println();
                
        }

        //lower-half

        // for(int i=1; i<=n; i++){
        for(int i=n; i>=1; i--){
            // first part
            for(int j=1; j<=i; j++){
            // for(int j=i; j>=1; j++){
                System.out.print("* ");
            }
            // spaces

            // IMPORTANT
            for(int j = n; j>i; j-- ){
                System.out.print("  ");
            }

            //againt upper 2nd half
            for(int j = n; j>i; j-- ){
                System.out.print("  ");
            }

            //upper 2nd half 
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }

            // row-end next line
            System.out.println();
                
        }
        
        
    }
}
