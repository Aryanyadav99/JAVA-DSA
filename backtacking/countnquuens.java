package backtacking;

public class countnquuens {
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
    public static int count=0;
    public static void nqueens(char[][]chessboard,int row){
        if(row==chessboard.length){
            count++;
            return;
        }
        for(int j=0;j<chessboard[0].length;j++){
            // insertion
            // check for placing 
            if(issafe(chessboard,row,j)){
                chessboard[row][j]='Q';
                nqueens(chessboard, row+1);
                // removal for not come two queens in same row
                chessboard[row][j]='X';
            } 
        }
    }
    public static void main(String[] args) {
        char chessboard[][]=new char[12][12];
        for(int i=0;i<chessboard.length;i++){
            for(int j=0;j<chessboard[0].length;j++){
                chessboard[i][j]='X';
            }
        }
        nqueens(chessboard,0);
        System.err.println(count);
    }
}

