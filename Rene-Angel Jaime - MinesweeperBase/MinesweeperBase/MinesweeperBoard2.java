
/**
 * Write a description of class Minesweeper here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

// 1 isBomb() DONE
// 2 BoardConstructor() DONE
// 3 printBoard() DONE
// 4 addMines() Done
// 5 addNums() not done

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
        if(Mines < rows*columns){
            for(int i = 0; i < Mines;){
                int pos =  (int) (Math.random() * (rows*columns));
                if(!board[pos].isMine()){
                    board[pos].changeValue(-1);
                    i++; // variable i will increment here so that the mines aren't stacked
                }
            }
        } else if(Mines > rows*columns){
            throw new Exception("That's too many mines there...");
        }
    }

    public void addNums(){ // Part 4
        for(int i = 0; i < rows*columns; i++){
            if(board[i].isMine()){
                //Right
                if (i+1 < board.length && !board[i+1].isMine()){
                    board[i+1].inc();
                }
                //Left
                if (i-1 >= board.length && !board[i-1].isMine()){
                    board[i-1].inc();
                }
                //Above
                if (i-rows >= board.length && !board[i-rows].isMine()){
                    board[i-rows].inc();
                }
            }
        }
    }
    /**This method is used for testing and will be deleted if using the GUI.
     *  It is still required for all students.
     */
    public void printBoard(){
        System.out.println("");
        System.out.println("Minesweeper");
        for(int i = 0; i < rows*columns; i++){
            if(i % columns == 0){
                System.out.println();
            }
            if(board[i].getValue() == -1){
                System.out.print(" X ");
            } else{                                         // printed...
                System.out.print(" ");                      // 0 X 0 
                System.out.print(board[i].getValue());      // X 0 X
                System.out.print(" ");                      // X 0 0
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
