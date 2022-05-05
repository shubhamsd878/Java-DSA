package Bit_Manipulation;
import java.util.*;
public class _P01_IMPORTANT_is_number_power_of_2 {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        
        int number=sc.nextInt();

        int n=1, result=2;
        boolean answer=false;

        while( (result)<=number){
            if( result == number)
            {
                answer=true;
                break;
            }
            n++;
            result=result*2;
        }

        if(answer==true)
        System.out.println("Yes, 2^" +n+" =" +number);
        else
        System.out.println(number+ " is not a power of 2.");
        // System.out.println("Yes, 2^" +n+" =" +number);
    }
}
