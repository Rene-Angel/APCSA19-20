/**
 * Write a description of class Cell here.
 * 
 * @author Wiebe 
 * @version 10.11.16
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Cell implements ActionListener{
    //Variables you need to work with
    private int value;
    
    //Variables you don't need to worry about or care about.
    private JButton button;
    /**
     * This constructor is complete and does not need modification
     */
    public Cell(){
        button = new JButton();
        button.addActionListener(this);
        button.setPreferredSize(new Dimension(20,20));
        button.setMargin(new Insets(0,0,0,0));
        value = 0;
    }
    /** This Method tells me if the cell is a bomb.
     * 
     * @return True if it is a bomb, otherwse false.
     */
    public int getValue(){
        return value;
    }
    public void changeValue(int newValue){
        value = newValue;
    }
    public void inc(){
        value++;
    }
    public boolean isMine(){ // Part 1
        if(value == -1){
            return true;
        } else{
            return false;
        }
    }
    
    //Additional Methods may be required. Please make them yourself.
    
    //The following methods are used for the User Inferface
    //These methods are fully functional and do not need to be modified.
    public void checkCell(){
        button.setEnabled(false);
        displayValue();
    }
    public void displayValue(){
        if(this.isMine()){
            button.setText("\u2600");
            button.setBackground(Color.RED);
        }else if(value!=0){
            if(value == 1){
                button.setBackground(Color.LIGHT_GRAY);
            } else if(value == 2){
                button.setBackground(Color.GRAY);
            } else if(value == 3){
                button.setBackground(Color.PINK);
            } else if(value == 4){
                button.setBackground(Color.MAGENTA);
            } else if(value == 6){
                button.setBackground(Color.CYAN);
            } else if(value == 7){
                button.setBackground(Color.YELLOW);
            } else if(value == 8){
                button.setBackground(Color.ORANGE);
            } else {
                button.setBackground(Color.WHITE);
            }
            button.setText(String.valueOf(value));
        }
        
    }
    public JButton getButton() {
        return button;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        checkCell();
    }
}
