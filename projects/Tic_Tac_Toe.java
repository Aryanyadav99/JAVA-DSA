package projects;
import java.util.*;
public class Tic_Tac_Toe {
    private char board[][];
    private char currchar;
    public Tic_Tac_Toe(){
        board=new char[3][3];
        currchar='X';
        initializeBoard();
    }
    private void initializeBoard(){
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                board[i][j]='-';
            }
        }
    }

    // print board

    public void printboard(){
        System.out.println("----Board----");
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[i].length;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }

    // change the current player 

    public void changeplayer(){
        if(currchar=='X'){
            currchar='0';
        }
        else{
            currchar='X';
        }
    }

    // check board full ? 

    public boolean boardfull(){
        for(int i=0;i<board.length;i++){
          for(int j=0;j<board[0].length;j++){
            if(board[i][j]=='-'){
                return false;
            }
          }
        }
        return true;
    }
    public boolean checkwin(){
        // for rows
        for(int i=0;i<board.length;i++){
            if(board[i][0]==currchar && board[i][1]==currchar && board[i][2]==currchar){
                return true;
            }
        }
        // for coln
        for(int j=0;j<board[0].length;j++){
            if(board[0][j]==currchar && board[1][j]==currchar && board[2][j]==currchar){
                return true;
            }
        }
        // for principle diagonal
        if(board[0][0]==currchar && board[1][1]==currchar && board[2][2]==currchar){
            return true;
        }
        // for another diagnoal
        if(board[0][2]==currchar && board[1][1]==currchar && board[2][0]==currchar){
            return true;
        }
        return false;
    }

    // play the game 

    public void play(){
        Scanner sc=new Scanner(System.in);
        while(true){
            printboard();
            System.err.println("Player "+currchar+" Enter your move(row,col)");
            int row=sc.nextInt();
            int col=sc.nextInt();
           if(row>2 || col>2 || row<0 || col<0 || board[row][col]!='-'){
            System.err.println("Invalid Input");
            continue;
           }
           board[row][col]=currchar;// valid input 
           if(checkwin()){
            printboard();
            System.err.println("Player "+currchar+" Won!");
            break;
           }
           if(boardfull()){
            printboard();
            System.out.println("Game is Drawn");
            break;
           }
             changeplayer();
        }
        sc.close();
    }
    public static void main(String[] args) {
        Tic_Tac_Toe game=new Tic_Tac_Toe();// make an object for our class to access all the private function of that class and access all non static methods 
        game.play();
    }
}
