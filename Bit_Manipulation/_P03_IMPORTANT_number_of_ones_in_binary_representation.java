// program to count no. of 1's in binary representation of nubmer
package Bit_Manipulation;

public class _P03_IMPORTANT_number_of_ones_in_binary_representation {
    public static void main(String[] args){
        int number=5;
        int count=0;
        int n=0;

        while(n<4)
        {
            int bitMask=1<<n;
            if((bitMask & number) != 0)       //IMPORTANT
            {
                count++;
            }
            n++;
        }
        System.out.println(count);
    }
}
