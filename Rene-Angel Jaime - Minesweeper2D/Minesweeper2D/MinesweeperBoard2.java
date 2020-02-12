/**
 * Write a description of class Minesweeper here.
 * 
 * @author Rene-Angel Jaime 
 * @version (12.2.19)
 */
// 1 isBomb() DONE
// 2 BoardConstructor() DONE
// 3 printBoard() DONE
// 4 addMines() DONE
// 5 addNums() DONE
import java.lang.Math;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class MinesweeperBoard2{
    Cell[][] board;
    int r;
    int c;    
    public MinesweeperBoard2(int row, int col){ // Part 2
        //Put the constructor here.
        r = row;
        c = col;
        board = new Cell[r][c];
        //These pieces are for the GUI.
        JFrame frame = new JFrame();
        frame.add(addCells());
        
        frame.pack();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    public void addMines(int Mines) throws Exception{ // Part 3
        if(Mines < r*c){
            for(int i = 0; i < Mines;){
                int ranR = (int) (Math.random() * r);
                int ranC = (int) (Math.random() * c);
                if(!board[ranR][ranC].isMine()){
                    board[ranR][ranC].changeValue(-1);
                    i++; // variable i will increment here so that the mines aren't stacked
                }
            }
        } else if(Mines > r*c){
            throw new Exception("That's too many mines there...");
        }
    }
    public void addNums(){ // Part 4
        for(int r = 0; r < board.length; r++){
            for(int c = 0; c < board[0].length; c++){
                if(board[r][c].isMine()){
                    //Right & Left
                    /**if(){
                        
                    }
                    //Above & Below
                    if(){
                        
                    }
                    // Left Diagonals
                    if(){
                        
                    }
                    // Right Diagonals
                    if(){
                        
                    } */
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
        for(int r = 0; r < board.length; r++){
            for(int c = 0; c < board[0].length; c++){
                if(r % c == 0){
                    System.out.println();
                }
                if(board[r][c].getValue() == -1){
                   System.out.print(" X ");
                   else                                          // printed...
                   System.out.print(" ");                      // 0 X 0 
                   System.out.print(board[r][c].getValue());      // X 0 X
                   System.out.print(" ");                      // X 0 0
                }
            }
        }
    }
    public JPanel addCells(){
        JPanel panel = new JPanel(new GridLayout(rows,c));
        for(int r = 0; r < board.length; r++){
            board[i]= new Cell();
            panel.add(board[r][c].getButton());
        }
        return panel;
    }

}
