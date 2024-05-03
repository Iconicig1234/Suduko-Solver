package game;
import board.Board;
import players.Players;

public class    Game {
    Board board;
    Players player;

    public Game(Board board, Players player){
        this.board = board;
        this.player = player;
    }

    public void play(){
        suduko_solver(0,0);
    }

    public void suduko_solver(int row, int col){
        if(row==board.get_board_size()){
            System.out.println("Suduko Solved !!");
            board.print_board_configuration();
            return;
        }
        int nrow = 0, ncol = 0;
        if(col == board.get_board_size()-1){
            nrow = row+1;
            ncol = 0;
        }
        else{
            nrow = row;
            ncol = col+1;
        }

        if(board.matrix[row][col] != 0){
            suduko_solver(nrow, ncol);
        }
        else{
            for(int i=1; i<=9; i++){
                if(is_valid_number(board.matrix, row, col, i)){
                    board.matrix[row][col] = i;
                    System.out.println(i);
                    suduko_solver(nrow, ncol);
                    board.matrix[row][col] = 0;
                }
            }
        }
    }

    private boolean is_valid_number(int matrix[][], int row, int col, int num){
        for(int i=0;i<matrix.length;i++){
            if(matrix[i][col]==num){
                return false;
            }
        }
        for(int i=0;i<matrix.length;i++){
            if(matrix[row][i]==num){
                return false;
            }
        }

        int temp_row = row/3*3;
        int temp_col = col/3*3;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(matrix[temp_row+i][temp_col+j]==num){
                    return false;
                }
            }
        }

        return true;
    } 
}
