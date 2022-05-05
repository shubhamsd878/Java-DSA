// toggle meaning: if bit at pos =0, then convert it into 1. if 1, then to0;
package Bit_Manipulation;
// import java.util.*;
public class _P02_toogleBits {
    public static void main(String[] args)
    {
        // Scanner sc=new Scanner(System.in);

        // System.out.println("Enter number: ");
        int number=5;
        // System.out.println("Enter pos: ");
        int pos=0;

        int bitMask=1<<pos;
        int result;
        
        if((bitMask & number)!=0)
        {
            bitMask = ~bitMask;
            result= bitMask & number;
            System.out.println(result);
        }
        else
        {
            result=bitMask | number;
            System.out.println(result);            
        }
    }
}