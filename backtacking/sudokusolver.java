package backtacking;

public class sudokusolver {
    public static boolean issafe(int sudoku[][],int row,int col,int digit){
        // check for row
        for(int i=0;i<9;i++){
            if(sudoku[row][i]==digit){
                return false;
            }
        }
        // column
        for(int i=0;i<9;i++){
            if(sudoku[i][col]==digit){
                return false;
            }
        }
        // for grid
        int sr=(row/3)*3;
        int sc=(col/3)*3;
        for(int i=sr;i<sr+3;i++){
            for(int j=sc;j<sc+3;j++){
                if(sudoku[i][j]==digit){
                    return false;
                }
            }
        }
        return true;
    }
    public static boolean solver(int sudoku[][],int row,int col){
        // base case
        if(row==9){
            return true;
        }
        //updation 
        int nextrow=row;
        int nextcol=col+1;
        if(nextcol==9){
            nextrow=row+1;
            nextcol=0;
        }
        if(sudoku[row][col]!=0){
           return solver(sudoku, nextrow, nextcol);
        }
        // digit collection 
        for(int i=1;i<=9;i++){
            int digit=i;
            if(issafe(sudoku,row,col,digit)){
                sudoku[row][col]=digit;
                if(solver(sudoku, nextrow, nextcol)){
                     return true;
                }
            }
            sudoku[row][col]=0;
            
        }
        return false;
    }
    public static void printsudoku(int sudoku[][]){
        for(int i=0;i<sudoku.length;i++){
            for(int j=0;j<sudoku[0].length;j++){
                System.out.print(sudoku[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] sudoku = {
            {5, 3, 0, 0, 7, 0, 0, 0, 0},
            {6, 0, 0, 1, 9, 5, 0, 0, 0},
            {0, 9, 8, 0, 0, 0, 0, 6, 0},
            {8, 0, 0, 0, 6, 0, 0, 0, 3},
            {4, 0, 0, 8, 0, 3, 0, 0, 1},
            {7, 0, 0, 0, 2, 0, 0, 0, 6},
            {0, 6, 0, 0, 0, 0, 2, 8, 0},
            {0, 0, 0, 4, 1, 9, 0, 0, 5},
            {0, 0, 0, 0, 8, 0, 0, 7, 9}
        };
        if(solver(sudoku,0,0)){
            System.out.println("sol exist");
            printsudoku(sudoku);
        }
        else{
            System.out.println("not exist");
        }
    }
}
