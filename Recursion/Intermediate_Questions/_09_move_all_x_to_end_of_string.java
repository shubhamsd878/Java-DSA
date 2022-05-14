package Recursion;

public class _09_move_all_x_to_end_of_string {
    
    static int n = 0;
    static String moveToEnd(String a, char ch, int idx , String result){
        if(a.length() == 1){
            return result;
        }
        if(a.length()-1 == idx){
            if(a.charAt(idx) == ch){
                n++;
            }
            else{
                result += a.charAt(idx);
            }

            for(int i = 0; i < n; i++){
                result = result + ch;
            }

            return result;
        }

        if(a.charAt(idx) == ch){
            n++;
        }
        else{
            result += a.charAt(idx);
        }

        return moveToEnd(a, ch, idx+1, result);
    }
    
    public static void main(String[] args){
        String a = "axbcxxd";

        String result = moveToEnd(a, 'x', 0, "");

        System.out.println(result );
    }
}
