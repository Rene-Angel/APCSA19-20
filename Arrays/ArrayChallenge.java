
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
        // Challenge 4 - Find the smallest number in the array (minimum)
        
        // #1
        double sum = 0;
        double[] challenge = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        // #2
        for(double num : challenge){
            sum += num;
        }
        System.out.println(sum);
        // #3
        double average = 0;
        average = sum/20;
        System.out.println(average);
    }
}
