package Backtracking;

// import javax.swing.text.html.HTMLDocument.RunElement;

public class _02_sudokuSolver {
    
    static void printSudoku( char board[][] ){
        for(int i = 0; i<9; i++){
            for(int j = 0; j<9; j++){
                System.out.print(" " + board[i][j] + " ");
                if( ( j+1 ) % 3 == 0)
                    System.out.print(" | ");
            }
            System.out.println();
            if((i+1) %3 == 0)
                System.out.println("------------------------------------");
        }
    }

    // check in row, col, grid  +  also check if place is empty 
    static boolean isSafe(char[][] board, int idxr, int idxc, char number){
        // place check
        // if(board[idxr][idxc] != '.'){
        //     return false;
        // }

        // in row
        for(int i = 0; i<9; i++){
            if( board[i][idxc] == number){
                return false;
            }
        }

        // in col
        for(int i = 0; i<9; i++){
            if( board[idxr][i] == number){
                return false;
            }
        }

        //in matrix                                     // ------ MOST IMPORTANT    <-----
        int row = (idxr/3) * 3;         // if 0 --> top-row-grid,  1 --> mid-row-gird,  2 --> bottom-row-grid
        int col = (idxc/3) * 3;         // if 0 --> top-row-grid,  1 --> mid-row-gird,  2 --> bottom-row-grid

        for(int i = row; i <= row + 2; i++ ){
            for ( int j = col; j <= col + 2; j++){
                if( board[i][j] == number){
                    return false;
                }
            }
        }

        return true;
    }

    static void sudokuSolver(char board[][], int idxr, int idxc){
        if(idxr == 9){
            printSudoku(board);
            return;
        }

        // approach could be row or col wise, 
        // col wise approach 


        // if not on last col then ++idxc,   else ++idxr  i.e. on last col
        for(int i = 1; i<=9; i++){
            if( board[idxr][idxc] != '.'){
                // sudokuSolver(board, idxr)
                if(idxc < 8 )
                    sudokuSolver(board, idxr, idxc + 1);
                else{
                    idxc =0;                                // --> IMPORTANT step
                    sudokuSolver(board, idxr + 1, idxc);
                }
            }
            if(isSafe(board, idxr, idxc, (char)(i + '0'))) {
                board[idxr][idxc] = (char)(i + '0');
                
                if(idxc < 8 )
                    sudokuSolver(board, idxr, idxc + 1);
                else{
                    idxc = 0;                                // --> IMPORTANT step
                    sudokuSolver(board, idxr + 1, idxc);
                }

                // if(idxc == 9 ){
                //     idxc =0;                                // --> IMPORTANT step
                //     sudokuSolver(board, idxr + 1, idxc);
                // }
                // else{
                //     sudokuSolver(board, idxr, idxc + 1);
                // }
                
                board[idxr][idxc] = '.';                //--> backtracking
            }
        }
    }

    public static void main(String[] args){
        char board[][] = new char[9][9];    //sudoku --> 9 x 9

        board[0][0] = '5';
        board[0][1] = '3';
        board[0][2] = '.';
        board[0][3] = '.';
        board[0][4] = '7';
        board[0][5] = '.';
        board[0][6] = '.';
        board[0][7] = '.';
        board[0][8] = '.';
        
        board[1][0] = '6';
        board[1][1] = '.';
        board[1][2] = '.';
        board[1][3] = '1';
        board[1][4] = '9';
        board[1][5] = '5';
        board[1][6] = '.';
        board[1][7] = '.';
        board[1][8] = '.';

        board[2][0] = '.';
        board[2][1] = '9';
        board[2][2] = '8';
        board[2][3] = '.';
        board[2][4] = '.';
        board[2][5] = '.';
        board[2][6] = '.';
        board[2][7] = '6';
        board[2][8] = '.';
        
        board[3][0] = '8';
        board[3][1] = '.';
        board[3][2] = '.';
        board[3][3] = '.';
        board[3][4] = '6';
        board[3][5] = '.';
        board[3][6] = '.';
        board[3][7] = '.';
        board[3][8] = '3';
        
        board[4][0] = '4';
        board[4][1] = '.';
        board[4][2] = '.';
        board[4][3] = '8';
        board[4][4] = '.';
        board[4][5] = '3';
        board[4][6] = '.';
        board[4][7] = '.';
        board[4][8] = '1';
        
        board[5][0] = '7';
        board[5][1] = '.';
        board[5][2] = '.';
        board[5][3] = '.';
        board[5][4] = '2';
        board[5][5] = '.';
        board[5][6] = '.';
        board[5][7] = '.';
        board[5][8] = '6';
        
        board[6][0] = '.';
        board[6][1] = '6';
        board[6][2] = '.';
        board[6][3] = '.';
        board[6][4] = '.';
        board[6][5] = '.';
        board[6][6] = '2';
        board[6][7] = '8';
        board[6][8] = '.';
        
        board[7][0] = '.';
        board[7][1] = '.';
        board[7][2] = '.';
        board[7][3] = '4';
        board[7][4] = '1';
        board[7][5] = '9';
        board[7][6] = '.';
        board[7][7] = '.';
        board[7][8] = '5';

        board[8][0] = '.';
        board[8][1] = '.';
        board[8][2] = '.';
        board[8][3] = '.';
        board[8][4] = '8';
        board[8][5] = '.';
        board[8][6] = '.';
        board[8][7] = '7';
        board[8][8] = '9';

        System.out.println("Sudoku before: ");
        printSudoku(board);    

        // int i = 1;
        // System.out.println((char)(i + '0'));
        sudokuSolver(board, 0, 0);
    }
}