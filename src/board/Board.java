package board;
import java.util.*;
import triples.Triples;

public class Board {
    public int size;
    public int matrix[][];

    public Board(int size){
        this.size = size;
        this.matrix = new int[size][size];
    }

    public void print_board_configuration(){
        int sz = this.size;
        for(int i=0; i<sz; i++){
            for(int j=0; j<sz; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void set_board_config_explicitly(int row, int col, int val){
        this.matrix[row][col] = val;
    }

    public void set_board_config_columnwise(int row, List<Integer>col, List<Integer>val){
        for(int i=0; i<col.size();i++){
            this.matrix[row][col.get(i)] = val.get(i);
        }
    }

    public void set_board_config_rowise(int col, List<Integer>row, List<Integer>val){
        for(int i=0; i<row.size();i++){
            this.matrix[row.get(i)][col] = val.get(i);
        }
    }

    public void set_board_config_implicitly(List<Triples>tri){
        for(int i=0; i<tri.size(); i++){
            this.matrix[tri.get(i).row][tri.get(i).col] = tri.get(i).val;
        }
    }
    
    public int get_board_size(){
        return this.size;
    }
}
