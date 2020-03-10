/**
 * @author Rene-Angel Jaime
 * @version (3.9.20)
 */
import java.util.ArrayList;
import java.util.List;
public class ModArrays
{
    public static int[] method1(int[] array, int num, int i){
        // Given: array {3,4,9,5,0}, num 2020, index 2
        // Expected: {3,4,2020,9,5}
        for(int j = array.length - 1; j > i; j--){
            array[j] = array[j-1];
        }
        array[i] = num;
        return array;
    }
    public static int[] method2(int[] array, int i){
        // Given: array {1,5,1,8,2,1,2,1}, index 3
        // Expected: {1,5,1,2,1,2,1,0}
        for(int j = i; j < array.length -1; j++){
            array[j] = array[j+1];
        }
        array[array.length -1] = 0;
        return array;
    }
}
