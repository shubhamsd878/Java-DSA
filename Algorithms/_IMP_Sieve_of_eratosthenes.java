public class _IMP_Sieve_of_eratosthenes {
    public static void printSieve(int n){
        int prime[] = new int[n];         //IMPORTANT intialized by 0

        for(int i=2; i<n; i++){
            if(prime[i] == 0){
                for(int j=i*i; j<n; j+=i){
                    prime[j]=1;
                }
            }
       }
       
       for(int i=2;i<n;i++){
           if(prime[i]==0)
           System.out.println(i);
       }
    }
    public static void main(String[] args){
        int n=50;
        printSieve(n);
    }
}
