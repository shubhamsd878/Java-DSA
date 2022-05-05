package Patterns;

public class _07 {
    public static void main(String[] args){
        int m =5;
        for(int i = 0; i<m; i++){
            for(int j = 0; j< m - i; j++){
                System.out.print(" " + (j+1) + " ");
            }
            System.out.println();
        }
    }
}
