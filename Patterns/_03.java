package Patterns;

public class _03 {
    public static void main(String args[]){
        int m = 4;

        for(int i = 1; i <= m ; i++){
            for(int j = 0; j< i; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
