package String;
import java.util.*;
public class _Problem_03_username_from_email {
    public static void main(String[] args)
    {
        System.out.println("\t***Program to create username from email entered by the user***");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter email: ");
        String email= sc.nextLine();
        String username="";
        for(int i=0; i<email.length(); i++)
        {
            if(email.charAt(i)=='@'){
                break;
            }
            else{
                username += email.charAt(i);
            }
        }
        System.out.println("username: " +username);
    }
}
