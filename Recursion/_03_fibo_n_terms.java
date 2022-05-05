package Recursion;

public class _03_fibo_n_terms {
    public static void Fibo(int a, int b,int n){
        if(n==0)        //IMPORTANT
        return;
        int c = a+b;
        System.out.println(c);
        a=b;
        b=c;
        Fibo(a, b, n-1);    //IMPORTANT
    }
    public static void main(String[] args){
        System.out.println(0);
        System.out.println(1);
        int n=7;
        Fibo(0,1,n-2);  //IMPORTANT
        
    }
}