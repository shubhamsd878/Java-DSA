// a, b, c=a&b
//Total no. of students = a + b - c

public class _Inclustion_Exclustion {
    public static int incExc(int a, int b, int n){
        int c1=n/a;
        int c2=n/b;
        int c3=n/(a*b);

        return c1 + c2 - c3;
    }
    public static void main(String[] args){
        //multiples of 5 & 7 upto 70
        int a=5,b=7,n=70;
        System.out.println(incExc(a, b, n));
    }
}
