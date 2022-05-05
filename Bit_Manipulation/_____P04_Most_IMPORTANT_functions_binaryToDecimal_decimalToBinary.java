package Bit_Manipulation;
// import java.util.*;
public class _____P04_Most_IMPORTANT_functions_binaryToDecimal_decimalToBinary{
    public static void binaryToDecimal(int binaryNum){
        int decimalNum;
        for(int i=0;i<3;i++){
            decimalNum=binaryNum       
        }
    }

    public static void decimalToBinary(int number){
        int binary;
        int arr[] = new int[3];
        for(int i=0;i<3;i++){
            // binary*=10;
            binary=(number%2);
            binary*=10;
            // arr[i]=number%2;
            number=number/2;
        }
        // binary=binary/10;
        // for(int i=0;i<3;i++){
        //     System.out.println(arr[i]);
        // }
        System.out.println(binary);
    }
    public static void main(String[] args)
    {
        int number=6, binaryNum=101;
        decimalToBinary(number);
        // binaryToDecimal(binaryNumber);   
    }
}