// Read theory, if(s1>s2) then +ve ; if(s1=s2) then 0; if (s2<s2) then -ve
package String;
import java.util.*;

public class _04_compareTo{
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        System.out.println("\t*** Program to compare String using compareTo***");
        System.out.println("Enter 1st string: ");
        String s1=sc.nextLine();
        System.out.println("Enter 2nd string: ");
        String s2=sc.nextLine();

        if(s1.compareTo(s2) == 0){
            System.out.println("Both s1 & s2 string are equal;");
        }
        if(s1.compareTo(s2) <0){
        System.out.println("s1 is smaller than s2");
        }
        if(s1.compareTo(s2) > 0){
            System.out.println("s1 is greater than s2");
        }
    }
}