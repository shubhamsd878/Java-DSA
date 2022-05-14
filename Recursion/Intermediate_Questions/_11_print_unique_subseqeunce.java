// for unique subsequences use HashSet, else remove HashSet
// number of subsequences = (2^n) - 1
package Recursion;
import java.util.*;
       
public class _11_print_unique_subseqeunce {

    static HashSet<String> set = new HashSet<>();

    static void printSubsequence(String str, int idx, String result){
        if( idx == str.length()){
            if(set.contains(result)){
                return;
            }
            else{
                System.out.println(result);
                set.add(result);
                return;
            }
        }

        printSubsequence(str, idx + 1, result + str.charAt(idx) );

        printSubsequence(str, idx + 1, result);

    }

    public static void main(String[] args){
        String a = "abc";
        // String a = "aaa";        //Check for unique

        printSubsequence( a, 0, "");
    }
    
}
    
