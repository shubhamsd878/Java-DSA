package Patterns;

public class _05 {
    public static void main(String[] args){
        int m = 5;              //can change this
        for(int i = 1; i <= m; i++){
            for(int j = 0; j < m-i; j++){
                System.out.print("   ");
            }
            for(int j = 0; j < i; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
