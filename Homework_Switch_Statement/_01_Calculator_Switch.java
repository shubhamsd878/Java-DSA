//package _01_Homework_Switch_Statement;
import java.util.*;

public class _01_Calculator_Switch {
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a , b, c;
        System.out.println("Enter number 1 and number 2");
        //Taking a and b as input
        a=sc.nextInt();
        b=sc.nextInt();
        
        // String c;
        System.out.println("Enter operator:");
        c=sc.nextInt();

        // System.out.print(a c b);
        // System.out.print(c);
        // System.out.println(a c b);
        switch (c) {
            case 1: System.out.println(a+b);
                break;
            case 2: System.out.println(a-b);
            break;
            case 3: System.out.println(a*b);
            break;
            case 4: System.out.println(a/b);
            break;
            case 5: System.out.println(a%b);
            break;
            default:
                break;
        }
    }
}

//Note: Don't know how to print     variable1(int) Operator variable(int) = Result      like    10 + 20 = 30    easily.