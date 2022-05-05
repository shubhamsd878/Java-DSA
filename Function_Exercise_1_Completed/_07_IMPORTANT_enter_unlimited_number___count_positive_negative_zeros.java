//* Do this problem with string yes to continue, no to exit
package Function_Exercise_1_Completed;

import java.util.*;
public class _07_IMPORTANT_enter_unlimited_number___count_positive_negative_zeros {
    public static void main(String[] args)
    {
        int a;
        int pos=0, neg=0, zero=0;
        int input=1;
        Scanner sc= new Scanner(System.in);
        // String string="y";
        System.out.println("\t *** Program to take input until the  user wants and count positive and negative Print int the end");
        // System.out.println("");
        while(input==1)
        {
            System.out.println("Enter number: ");
            a=sc.nextInt();
            System.out.println("Press '1' to Continue, '0' to stop ");
            input=sc.nextInt();
            
            if(a>0)
            pos++;

            if(a==0)
            zero++;

            if(a<0)
            neg++;
        }

        System.out.println("No. of times positive number entered: \t"+pos);
        System.out.println("No. of times negative number entered: \t"+neg);
        System.out.println("No. of times zero number entered: \t"+zero);

    }
}
