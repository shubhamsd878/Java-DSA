// if not possible print nothing like if n == 3

package Backtracking;

public class _01_n_queen {

    // checks for all 6 directions
    static boolean isSafe( int board[][], int row, int col, int n){
        // System.out.println(" row: " + row +" col: " + col);
        // 1. for row;
        for(int i = 0; i < n; i++){
            if( board[i][col] == 1 ){
                return false;
            }
        }

        // 2. for col
        for(int i = 0; i < n; i++){
            if( board[row][i] == 1 ){
                return false;
            }
        }

        //3. left upper 
        int idxr = row, idxc = col;
        while( idxr >= 0 && idxc >= 0){
            if( board[idxr][idxc] == 1 ){
                return false;
            }
            idxr--;
            idxc--;
        }

        //4. right upper 
        idxr = row;
        idxc = col;
        while( idxr >= 0 && idxc < n){
            if( board[idxr][idxc] == 1 ){
                return false;
            }
            idxr--;
            idxc++;
        }

        //5. left lower 
        idxr = row;
        idxc = col;
        while( idxr < n && idxc >= 0){
            if( board[idxr][idxc] == 1 ){
                return false;
            }
            idxr++;
            idxc--;
        }
        
        //5. right lower 
        idxr = row;
        idxc = col;
        while( idxr < n && idxc < n){
            if( board[idxr][idxc] == 1 ){
                return false;
            }
            idxr++;
            idxc++;
        }

        return true;
    }
    // idx could be readed as col or row according to the algorithm
    static void nQueen(int n, int board[][], int idx){
        if( idx == n ){
            for(int i = 0; i<n; i++){
                for(int j = 0; j<n; j++){
                    System.out.print( board[i][j]);
                }
                System.out.println();
            }
            System.out.println("-------------------");
            return;
        }

        for(int i = 0; i<n; i++){
            if( isSafe(board, i, idx, n) ){
                board[i][idx] = 1;
                nQueen(n, board, idx + 1);
                board[i][idx] = 0;        //don't forget if previous sol. doesn't work
            }
        }
    }
    public static void main(String args[]){
        // int n = 4;
        int n = 5;
        int board[][] = new int[n][n];
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                board[i][j] = 0;
            }
        }

        // System.out.println(board.length);
        nQueen(n, board, 0);
        // if not possible print nothing
    }
}