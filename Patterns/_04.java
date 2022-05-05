package Patterns;

public class _04 {
    public static void main(String[] args){
        int m = 5;
        for(int i = 1; i <= m; i++){
            for(int j = 0; j< m - i; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
