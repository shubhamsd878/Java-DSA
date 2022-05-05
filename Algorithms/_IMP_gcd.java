public class _IMP_gcd {
    public static int gcd(int a, int b){
        int rem=1;
        while (rem!=0){
            rem=a%b;
            a=b;
            b=rem;
        }
        return b;
    }
   public static void main(String[] args){
       int a=42,b=24;
       System.out.println(gcd(a,b));
   }
}