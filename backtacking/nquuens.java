package backtacking;

public class nquuens {
    public static boolean issafe(char chessboard[][],int row,int col){
        // straight upward
        for(int i=row;i>=0;i--){
            if(chessboard[i][col]=='Q'){
                return false;
            }
        }
        // upward left diagonal
        for(int i=row,j=col ;i>=0 && j>=0 ;i--,j--){
            if(chessboard[i][j]=='Q'){
                return false;
            }
        }
        // upward rigthdiagonal
        for(int i=row ,j=col; i>=0 && j<chessboard[0].length;i--,j++){
          if(chessboard[i][j]=='Q'){
            return false;
          }
        }
        return true;
    }
    public static void printbord(char chessboard[][]){
        System.out.println("------ChessBoard------");
        for(int i=0;i<chessboard.length;i++){
            for(int j=0;j<chessboard[0].length;j++){
                System.out.print(chessboard[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void nqueens(char[][]chessboard,int row){
        if(row==chessboard.length){
            printbord(chessboard);
            return;
        }
        for(int j=0;j<chessboard[0].length;j++){
            // insertion
            // check for placing 
            if(issafe(chessboard,row,j)){
                chessboard[row][j]='Q';
                nqueens(chessboard, row+1);
                // removal because if the quen is not possible to place there then we can complete the col loop we hit the return at last and move to preious row and col where we place the prev possible queen 
                // but there is no place to put the queen ahead of this placed queen row then definietly we placed the queen in wrong col so remove from it and apply the process for next col
                chessboard[row][j]='X';
            } 
        }
    }
    public static void main(String[] args) {
        char chessboard[][]=new char[8][8];
        for(int i=0;i<chessboard.length;i++){
            for(int j=0;j<chessboard[0].length;j++){
                chessboard[i][j]='X';
            }
        }
        nqueens(chessboard,0);
    }
}
