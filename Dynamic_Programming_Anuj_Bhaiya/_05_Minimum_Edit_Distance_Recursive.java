package Dynamic_Programming_Anuj_Bhaiya;

class _05_Minimum_Edit_Distance_Recursive{
    public static void main(String[] args){
        // String str1 = "DIG", str2 = "DOG";                   //1
        String str1 = "ABCAB", str2 = "EACB";                   //3

        int m = str1.length(), n = str2.length();

        int result = minEditDistance( str1, str2, m, n);

        System.out.println( result );
    }

    static int minEditDistance( String str1, String str2, int m, int n){

        if( m==0 ){
            return n;
        }

        if( n==0){
            return m;
        }

        if( str1.charAt(m-1) == str2.charAt(n-1)){
            return minEditDistance(str1, str2, m-1, n-1);
        }

        int ins, rep, del;

        ins = 1 + minEditDistance(str1, str2, m, n-1);
        del = 1 + minEditDistance(str1, str2, m-1, n);
        rep = 1 + minEditDistance(str1, str2, m-1, n-1);

        return Math.min(ins, Math.min(rep, del));
    }
}