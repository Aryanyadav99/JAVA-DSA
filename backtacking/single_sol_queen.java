// this is the way to show the first possible sol or say only one possible sol
// the way to show the one possible sol is store all the sol into an extra array names one sol since we store all the sol and it store the next one by updating the previous one 
// thats the way we can finally print the array at end 

package backtacking;

public class single_sol_queen {
    static boolean foundoneSolution = false; // Flag to indicate if a solution has been found

    public static boolean isSafe(char chessboard[][], int row, int col) {
        // Check straight upward
        for (int i = row; i >= 0; i--) {
            if (chessboard[i][col] == 'Q') {
                return false;
            }
        }
        // Check upward left diagonal
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (chessboard[i][j] == 'Q') {
                return false;
            }
        }
        // Check upward right diagonal
        for (int i = row, j = col; i >= 0 && j < chessboard[0].length; i--, j++) {
            if (chessboard[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }

    public static void printBoard(char chessboard[][]) {
        System.out.println("------ChessBoard------");
        for (int i = 0; i < chessboard.length; i++) {
            for (int j = 0; j < chessboard[0].length; j++) {
                System.out.print(chessboard[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void nQueens(char[][] chessboard, int row) {
        if (row == chessboard.length) {
            // We found a solution; mark that we found a solution
            foundoneSolution = true;
            printBoard(chessboard); // Mark that we found a solution
            return; // Continue searching for more solutions
        }
        for (int j = 0; j < chessboard[0].length; j++) {
            if (isSafe(chessboard, row, j)) {
                chessboard[row][j] = 'Q'; // Place the queen
                nQueens(chessboard, row + 1); // Recur to place the next queen

                // If we are at the one row and a solution was found, print the board
                if ( foundoneSolution) {
                    
                    return ;
                }

                // Backtrack
                chessboard[row][j] = 'X'; // Remove the queen
            }
        }
    }

    public static void main(String[] args) {
        int n = 4; // Change this to adjust the board size
        char chessboard[][] = new char[n][n];
        for (int i = 0; i < chessboard.length; i++) {
            for (int j = 0; j < chessboard[0].length; j++) {
                chessboard[i][j] = 'X'; // Initialize the board
            }
        }
        nQueens(chessboard, 0);

        // If no solution was found
        if (!foundoneSolution) {
            System.out.println("No solution found.");
        }
    }
}


