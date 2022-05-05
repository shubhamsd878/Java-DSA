package Patterns;

public class _10_IMPORTANT {
    public static void main(String[] args){
        int m = 5;   //rows

        for(int i = 0; i < m; i++){
            for(int j = 0; j < m - i; j++){
                System.out.print("   ");
            }
            for(int j = 0; j < m; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
