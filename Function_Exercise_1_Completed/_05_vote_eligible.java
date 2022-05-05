package Function_Exercise_1_Completed;
import java.util.*;

public class _05_vote_eligible {
    public static void main(String[] args)
    {
        int age;
        Scanner sc= new Scanner(System.in);
        System.out.println("\t*** Program to check whether person is eligible to vote or not***");
        System.out.println("Enter age: ");
        age=sc.nextInt();
        if (age>18) 
        {
            System.out.println("Congrats! You are above 18. You can vote");            
        }
        else
        System.out.println("Sorry! You are below 18. You can't vote");

        
    }
}
