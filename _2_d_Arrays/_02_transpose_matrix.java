package _2_d_Arrays;
import java.util.*;
public class _02_transpose_matrix {
    public static void  main(String[] args)
    {
        int arr[][] = new int[4][4];
        int transpose[][] = new int [4][4];
        // could also be done without  tranpose array.

        Scanner sc= new Scanner(System.in);
        {13,14,15,16} };
        
        for(int i =0; i<4;i++)
        {
            for(int j=0; j<4; j++)
            {
                arr[i][j] = sc.nextInt();
                // System.out.print("");
            }
            System.out.println();
        }
        
        //Best Method
        for(int i=0; i<4; i++)
        {
            for(int j=0; j<4; j++)
            {
                System.out.print(arr[j][i]);
            System.out.print("\t");
            }
            System.out.println();
        }
        //Transpose of matrix
        // transpose=arr;
        for(int i=0; i<4; i++)
        {
            for(int j=0; j<4;j++)
            {
                transpose[j][i]= arr[i][j];
            }
        }

        for(int i=0; i<4; i++)
        {
            for(int j=0; j<4;j++ )
            {
                System.out.print(transpose[i][j]);
            System.out.print("\t");
            }
            System.out.println();
        }
         
    }
}