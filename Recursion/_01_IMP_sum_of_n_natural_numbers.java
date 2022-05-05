package Recursion;

public class _01_IMP_sum_of_n_natural_numbers {
    public static void printNatSum(int i,int n, int sum){
        if(i==n){
            sum +=n;
            System.out.println(sum);
            return;
        }

        sum +=i;
        i +=1;
        printNatSum(i,n, sum);
    }

    public static void main(String[] args){
        printNatSum(1,5, 0);
    }
}
