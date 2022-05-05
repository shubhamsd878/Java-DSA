package String;
import java.util.*;

public class _IMPORTANT_Problem_02_letter_e_to_i {
  
    public static void main(String[] args){
        System.out.println("\t *** Program to change String char 'e' to 'i'*** ");
    
        Scanner sc= new Scanner(System.in);
        
        // char z='i';
        // String sentence= sc.next();
        // for(int i=0; i< sentence.length(); i++){
        //     if( sentence.charAt(i) == 'e'){
        //     sentence.charAt(i) = z;
        //     }
        // }
        System.out.println("Enter sentence:- ");
        String sentence2=sc.nextLine();
        String result="";
        for(int i=0; i<sentence2.length(); i++)
        {
            if(sentence2.charAt(i) == 'e'){
                result += 'i';
            }
            else{
                result += sentence2.charAt(i);
            }
        }
        
        System.out.println(result);
    }
}
