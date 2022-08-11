package Recursion.Intermediate_Questions;

public class _10_remove_all_duplicates {
    static boolean map[] = new boolean[26];
    
    static String removeDuplicates(String a, int idx, String result ){
        if(a.length() == 1){
            return a;
        }

        // if( idx == a.length() - 1){
        if( idx == a.length()){
            return result;
        }

        // map is initialized to false by default
        if( !map[a.charAt(idx) - 97]){
            result += a.charAt(idx);
            map[a.charAt(idx) - 97] = true;
        }

        return removeDuplicates(a, idx+1, result);

        // return "error";
    }
    public static void main(String[] args){
        String a = "abbccda";
        // String a = "aa";

        String result = removeDuplicates(a, 0, "");

        System.out.println(result);
    }
}
