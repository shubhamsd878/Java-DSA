package Recursion.Advanced_Questions;

public class _13_permutations_of_string {
    static String swap( String str, int idx1, int idx2){
        char[] charArray = str.toCharArray();

        char temp = charArray[idx1];
        charArray[idx1] = charArray[idx2];
        charArray[idx2] = temp;

        return String.valueOf(charArray);
    }
    
    static void permute( String str, int idx){
        if(idx == str.length()){
            System.out.println(str);
            return;
        }

        // i = idx --> fixes before idx characters
        for(int i = idx; i< str.length(); i++){
            String swapped = swap(str, idx, i);
            permute(swapped, idx + 1);
        }
    }
    public static void main(String args[]){
        String a = "abc";
        permute(a, 0);
    }
}
