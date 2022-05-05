package Patterns;

public class _11_IMPORTANT {
    public static void main(String[] args){
        int m = 6;
        int num = 1;
        for(int i =1; i < m; i++ ){
            for(int j=0; j <= (m-i)/2; j++){
                System.out.print(" ");
            }
            for(int j=1; j <= i; j++){
                System.out.print(num +" ");

            }
            num++;
            System.out.println( );
        }
    }
}
