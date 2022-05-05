package Function_Exercise_1_Completed;
import java.util.*;

public class _04_circumference_of_circle {
    public static void circumference(float r)
    {
        float circum;
        // circum = r * 2 * 3.14 ;
        System.out.println("Calculated Circumference: "+2*3.14*r;
    }
    public static void main(String[] agrs)
    {
        float r,circum;
        Scanner sc= new Scanner(System.in);
        System.out.println("\t *** Program to Calculate circumference of Circle ***");
        System.out.println("Enter radius of circle: ");
        r=sc.nextFloat();
        circumference(r);
        // circum = 2 * 3.14 * r;
        // System.out.println("Calculated Circumference: "+circum);
    }
}
