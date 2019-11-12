
/**
 * Write a description of class Minesweeper here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.lang.Math;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class MinesweeperBoard2{
    Cell[] board;
    int rows;
    int columns;
    public MinesweeperBoard2(int row, int col){ // Part 2
        //Put the constructor here.
        rows = row;
        columns = col;
        board = new Cell[rows*columns];
        //These pieces are for the GUI.
        JFrame frame = new JFrame();
        frame.add(addCells());
        
        frame.pack();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public void addMines(int Mines) throws Exception{ // Part 3
        for(int i = 0; i < Mines; i++){
            double pos = Math.random() * (rows*columns);
            pos = (int) pos;
            if(board[i].isMine() == false){
                board[i].isMine = true;
            }
        }
    }

    public void addNums(){ // Part 4
        for(int i = columns; i < rows*columns; i++){
            
        }
    }
    /**This method is used for testing and will be deleted if using the GUI.
     *  It is still required for all students.
     */
    public void printBoard(){
        System.out.println("     Minesweeper");
        for(int i = columns; i < rows*columns; i++){
            if(i % columns == 0){
                System.out.println();
            }
            System.out.print(board[i].getValue());
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
