// Incomplete
package _2_d_Arrays;
// import java.util.Scanner;
import  java.util.*;
public class _01_IMPORTANT_Spiral_order_matrix_output {
    public static void main(String[] args)
    {
        System.out.println("\t***Program to take simple matrix input and print spiral output***");
        int[][] matrix = new int [4][4];
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter matrix values for matrix of order 4 row-wise: ");
        for(int i =0; i<4;i++)
        {
            for(int j=0; j<4; j++)
            {
                matrix[i][j] = sc.nextInt();
                // System.out.print("");
            }
            System.out.println();
        }

        // SPIRAL output of matrix
        for(int i=0; i<4; i++)
        {
            for(int j=0; j<4; )
            {
                System.out.print(matrix[i][j++]);
            System.out.print("\t");
            }
            System.out.println();

        }

        //Simple Output of matrix
        // for(int i =0; i<4;i++)
        // {
        //     for(int j=0; j<4; j++)
        //     {
        //         System.out.print(matrix[i][j]);
        //         System.out.print(" ");
        //     }
        //     System.out.println();
        // }
    }

}
