/**
 * Write a description of class ArrayChallenge here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ArrayChallenge
{
    public static void main(){
        // Challenge 1 - Create an array of doubles (20 numbers)
        // Challenge 2 - Find the sums of all the elements in the array
        // Challenge 3 - Find the average of all the numbers
        // Challenge 4 - Find the largest number in the array (maximum)
        // Challenge 5 - Find the smallest number in the array (minimum)
        
        // #1
        double sum = 0;
        double[] challenge = {651,198,14981,71,91,9165,178,652};
        // #2
        
        /*
        for(double num : challenge){ //For each loop (Enhanced for loop) works but use traditional loop for practice
            sum += num;
        }
        */
        for(int i = 0; i < challenge.length; i++){
            sum += challenge[i];
        }
        System.out.println(sum);
        // #3
        double average = 0;
        average = sum / challenge.length;
        System.out.println(average);
        // #4
        double max = 0;
        for(int i = 0; i < challenge.length; i++){
            if (max <= challenge[i] ){
                max = challenge[i];
            }
        }
        System.out.println(max);
        // #5
        double minimum = challenge[1];
        for(int i = 0; i < challenge.length; i++){
            if (minimum >= challenge[i] ){
                minimum = challenge[i];
            }
        }
        System.out.println(minimum);
    }
} 