package Recursion.Intermediate_Questions;

public class _12_keypad_combination {
    // map 
    static String keypad[] = {".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

    static void keypadCombination(String a, int idx, String result){
        if(idx == a.length()){
            System.out.println(result);
            return;
        }

        int iterationLimit = keypad[ Integer.parseInt(String.valueOf(a.charAt( idx ))) ].length();

        for(int i = 0; i < iterationLimit; i++){
            keypadCombination(a, idx + 1, result + keypad[ Integer.parseInt(String.valueOf(a.charAt(idx))) ].charAt(i) );
        }
        
    }

    public static void main(String[] args){

        keypadCombination("23", 0 , "");
        // System.out.println(keypad[2].length());
    }
}
