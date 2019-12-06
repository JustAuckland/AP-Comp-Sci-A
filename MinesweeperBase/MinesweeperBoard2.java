
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
        for(int i = 0; i < bombs; i++){
            double randomloc = Math.random() * board.length;
            int randomlocation = (int) randomloc;
            while(board[randomlocation].isBomb()){
                randomloc = Math.random() * board.length;
                randomlocation = (int) randomloc;
            }
            board[randomlocation].changeValue(-1);
        }
    }

    /**public void addNums(){
        for (int i = 0; i < rows * columns; i++){
            if (!board[i].isBomb()){
                if (i + 1) > 0 && board[i].isBomb{
                    board[i].changeValue(board[i].hryValue() + 1)
                }
                
                
            }
        }
    }
    /**This method is used for testing and will be deleted if using the GUI.
     *  It is still required for all students.
     */
    public void printBoard(){      
        for(int i = 0; i < board.length; i++){
            if (i % columns == 0){
                System.out.println();
            }
            if (board[i].getValue() >= 0){
                System.out.print(board[i].getValue() + " ");
            }else{
                System.out.print("X ");
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
