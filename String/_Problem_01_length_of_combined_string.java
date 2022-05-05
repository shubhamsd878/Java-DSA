//Problem: size if(size==3) then only taking 2 inputs, size=5 then 4 inputs
package String;
import java.util.*;

public class _Problem_01_length_of_combined_string{
    public static void main(String[] args){

        Scanner sc= new Scanner(System.in);
        System.out.println("\t***Program to get length of mutliple string*** ");
        System.out.println("Enter size of array:");
        int size= sc.nextInt();

        String sentence[] = new String[size];
        for(int i=0; i < size; i++){
            sentence[i] = sc.nextLine();
        }

        String LengthStr="";
        for(int i=0; i<size; i++){
            LengthStr += sentence[i];
        }
        
        System.out.println("Combined String= " + LengthStr);
        System.err.print("Length of String is:");
        System.out.println(LengthStr.length());
    }
}