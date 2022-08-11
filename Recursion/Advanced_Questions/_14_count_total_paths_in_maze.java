// this algo not efficient, at 20:17 --> https://www.youtube.com/watch?v=xZykmhcWGuY&list=PLfqMhTWNBTe3LtFWcvwpqTkUSlB32kJop&index=22&ab_channel=ApnaCollege
// used dynamic programming to reduce time complexity
package Recursion.Advanced_Questions;


public class _14_count_total_paths_in_maze {
 
    static int paths = 0;
    static int countMazePaths(int maze[][], int m, int n, int idxm, int idxn){
        if(idxm == m-1 && idxn == n-1){

            paths++;
            return paths; //returns nothing paths no use,
        }

        if(idxm < m)
            countMazePaths(maze, m, n, idxm + 1, idxn);

        if(idxn < n)
            countMazePaths(maze, m, n, idxm, idxn + 1);

        return paths;
    }
    public static void main(String args[]){
        int m = 3, n = 3;
        int maze[][]= new int[m][n];

        int result = countMazePaths(maze, m, n, 0, 0);
        System.out.println(result);
    }
}