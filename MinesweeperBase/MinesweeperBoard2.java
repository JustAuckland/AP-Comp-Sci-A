
/**
 * Write a description of class Minesweeper here.
 * 
 * @author Auckland V. 
 * @version 10/30/19
 */
import java.lang.Math;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class MinesweeperBoard2{
    Cell[] board;
    int rows;
    int columns;
    public MinesweeperBoard2(int row, int col){
        //Put the constructor here.
        this.rows = row;
        this.columns = col;
        this.board = new Cell[columns * rows];
        
        //These pieces are for the GUI.
        JFrame frame = new JFrame();
        frame.add(addCells());
        
        frame.pack();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public void addBombs(int bombs){
        
    }

    public void addNums(){
        
    }
    /**This method is used for testing and will be deleted if using the GUI.
     *  It is still required for all students.
     */
    public void printBoard(){      
        for(int i = 0; i<rows; i++){
            for(int j = 0; j<columns; j++){
                
            }
            
        }
    }
    public JPanel addCells(){
        JPanel panel = new JPanel(new GridLayout(rows,columns));
        for(int i = 0; i< rows*columns; i++){
                board[i]= new Cell();
                panel.add(board[i].getButton());
        }
        return panel;
    }
}
