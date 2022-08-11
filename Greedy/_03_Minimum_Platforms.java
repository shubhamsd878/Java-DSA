// concept solution --> if train arrive count++, departure count--; print MaxCount
package Greedy;

import java.util.Arrays;

public class _03_Minimum_Platforms {
    public static void main(String[] args) {
        int a[] = {900, 940, 950, 1100, 1500, 1800};    //timing 900 --> 09:00
        int d[] = {910, 1200, 1120, 1130, 1900, 1200};
        // int a[] = { 200, 210, 300, 320, 350, 500 };    //timing 900 --> 09:00
        // int d[] = { 230, 340, 320, 430, 400, 520 };

        System.out.println( minPlatforms(a, d, a.length) );
    }

    static int minPlatforms(int a[], int d[], int n ){

        Arrays.sort(a);
        Arrays.sort(d);

        int aP = 0, dP = 0;     // aP = aPointer    dP = dPointer
        int count = 0, MaxCount = 0;

        while( aP <n && dP < n){

            if( a[aP] <= d[dP]){            //****READ*****     */ == depends on condition, waht you are taking on arrival and departure of train simultanously 
                count++;
                aP++;

                MaxCount = Math.max(MaxCount, count);
            }
            else{
                count--;
                dP++;
            }
        }

        return MaxCount;
        
    }
}
