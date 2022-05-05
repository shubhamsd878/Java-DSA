package Patterns;

public class _02 {
    public static void main(String args[]){
        int m = 3, n= 4; 
        for(int i= 0; i <= m; i++){
            for(int j = 0; j <= n; j++){
                if(i == 0 || i == m || j == 0 || j==n ){
                    System.out.print(" * ");
                }
                else{
                    System.out.print("   ");
                }
            }   
            System.out.println();
        }
    }
}
