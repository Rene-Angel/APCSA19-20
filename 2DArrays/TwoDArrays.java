
/**
 * Write a description of class TwoDArrays here.
 *
 * @author Rene-Angel Jaime
 * @version (1.7.20)
 */
public class TwoDArrays
{
    int[] array = new int[10];
    int[][] tdArray = new int[10][10];
    int[][] otherArr = new int[5][10];
    int[][][][][][][][][][] tenD;
    //picture = 2D array of pixels (3D)
    //px = [r,g,b]
    //folder = array of pictures (4D)
    //deal with multiple dimensions
    //row major format: row comes first and columns go second
    //int[][] arr = int[4][4]
    //arr[2][2]
    // 0 0 0 0
    // 0 0 0 0
    // 0 0 1 0
    // 0 0 0 0
    //arr[3][1]
    // 0 0 0 0 
    // 0 0 0 0 
    // 0 0 0 0 
    // 0 1 0 0 
    //arr[2][3]
    // 0 0 0 0 
    // 0 0 0 0 
    // 0 0 0 1 
    // 0 0 0 0 
    
    public TwoDArrays(){
        tdArray[0][0] = 1;
        tdArray[1][3] = 4;
    }
    public void numberAllCells(){
        int num = 1;
        for(int r = 0; r < tdArray.length; r++){
            for(int c = 0; c < tdArray[0].length; c++){
                tdArray[r][c] = num;
                num++;
            }
        }
    }
    public int addAllNumbers(){
        int total = 0;
        for (int r = 0; r < tdArray.length; r++){
            for (int c = 0; c < tdArray[0].length; c++){
                total += tdArray[r][c];
            }
        }
        return total;
    }
    public int addAllNumbers2(){
        // This is an example with an ENHANCED FOR LOOP
        // Enhanced for loops CANNOT be used to change values in an array
        // In a simple manner the colon (:) would mean "for every... in... "
        
        int total = 0;
        for (int[] oneArr : tdArray){
            for (int num : oneArr){
                total += num;
            }
        }
        return total;
    }
}