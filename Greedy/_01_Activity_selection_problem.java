package Greedy;

class _01_Activity_selection_problem{
    public static void main(String[] args) {
        int s[] = {5, 1, 3, 0, 5, 8};
        int f[] = {9, 2, 4, 6, 7, 9};

        print_Max_Activities( s, f);
        
    }

    static void print_Max_Activities( int[] s, int[] f){
        // step 1
        sort(s, f);

        // int selected[] = new int[f.length];

        System.out.println(" following activities are selected: ");
        
        // for reference of previously selected activity
        int j = 0;                                      // IMPORTANT
        System.out.println( s[0] + " " + f[0]);

        for( int i = 1; i < f.length; i++){
            if( s[i] >= f[j] ){
                
                System.out.println( s[i] + " " + f[i]);
                j = i;

            }
        }

    }

    static void sort( int[] s, int[] f){

        for(int i = 0; i < f.length - 1; i++){
            if( !(f[i] < f[i+1]) ){
                int temp1, temp2;
                
                temp1 = f[i];
                f[i] = f[i+1];
                f[i+1] = temp1;

                temp2 = s[i];
                s[i] = s[i+1];
                s[i+1] = temp2;
            }   
        }
    }


}