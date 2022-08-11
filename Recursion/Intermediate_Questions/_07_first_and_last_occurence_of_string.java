package Recursion.Intermediate_Questions;

public class _07_first_and_last_occurence_of_string {
    static int firstidx = -1, lastidx = -1;

    static void fAndLoccurence(String a, char ch, int idx){
        if(idx == a.length() - 1){
            if(a.charAt(idx) == ch){
                if(firstidx == -1)
                    firstidx = idx;

                lastidx = idx;
            }
            return;
        }

        if(a.charAt(idx) == ch){
            if(firstidx == -1)
                firstidx = idx;

            lastidx = idx;
        }
        fAndLoccurence(a, ch, idx+1);
        
        // result
        System.out.println("first index = " + firstidx + ", last index + " + lastidx);

    }
    public static void main(String[] args){
        String a = "abaacdaefaah";
        fAndLoccurence(a, 'a', 0);
    }
}
