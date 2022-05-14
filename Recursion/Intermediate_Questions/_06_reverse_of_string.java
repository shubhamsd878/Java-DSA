package Recursion;

public class _06_reverse_of_string {
    static void revString(String a, int idx){
        if(a.length()-1 == idx){
            System.out.print(a.charAt(idx));
            return;
        }
        revString(a, idx+1);
        System.out.print(a.charAt(idx));
    }
    public static void main(String[] args){
        String a = "abdc";
        revString(a, 0);
    }
}
