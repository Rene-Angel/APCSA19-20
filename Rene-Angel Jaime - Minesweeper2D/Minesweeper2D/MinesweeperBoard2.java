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
                    if(c > 0 && !board[r][c-1].isMine()){
                        board[r][c-1].inc();
                    }
                    if(c+1 != board[0].length &&!board[r][c+1].isMine()){
                        board[r][c+1].inc();
                    }
                    //Above & Below
                    if(r > 0 && !board[r-1][c].isMine()){
                        board[r-1][c].inc();
                    }
                    if(r+1 != board.length && !board[r+1][c].isMine()){
                        board[r+1][c].inc();
                    }
                    // Left Diagonals
                    if(r > 0 && c > 0 && !board[r-1][c-1].isMine()){
                        board[r-1][c-1].inc();
                    }
                    if(r+1 != board.length && c > 0 && !board[r+1][c-1].isMine()){
                        board[r+1][c-1].inc();
                    }
                    // Right Diagonals
                    if(r > 0 && c+1 != board[0].length && !board[r-1][c+1].isMine()){
                        board[r-1][c+1].inc();
                    }
                    if(r+1 != board.length && c+1 != board[0].length && !board[r+1][c+1].isMine()){
                        board[r+1][c+1].inc();
                    }
                }
            }
        }
    }
    /**This method is used for testing and will be deleted if using the GUI.
     *  It is still required for all students.
     */
    public void printBoard(){
        for(int r = 0; r < board.length; r++){
            for(int c = 0; c < board[0].length; c++){
                if(board[r][c].isMine()){
                   System.out.print("X ");
                } else{
                   System.out.print(board[r][c].getValue() + " ");
                }
            }
            System.out.println();
        }
    }
    public JPanel addCells(){
        JPanel panel = new JPanel(new GridLayout(r,c));
        for(int r = 0; r < board.length; r++){
            for(int c = 0; c < board[0].length; c++){
                board[r][c] = new Cell();
                panel.add(board[r][c].getButton());
            }
        }
        return panel;
    }

}
