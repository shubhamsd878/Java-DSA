package Patterns;

public class _08 {
    public static void main(String[] args){
        int m =8;
        int num = 1;
        for(int i = 0; i<m; i++){
            for(int j= 0; j < i; j++){
                System.out.print(" " + num++ + " ");
            }
            System.out.println();
        }
    }
}
