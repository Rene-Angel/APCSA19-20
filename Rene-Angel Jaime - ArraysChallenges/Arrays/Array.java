/**
 * @author Rene-Angel Jaime
 * @version (10.29.19)
 */
public class Array{
    public static void main(){
        int[] newArray;
        // int[] array2 = {1,2,3,4,5,6,7,8,9,10}; no, due to memory allocation
        newArray = new int[10];
        int[] array2 = {1,2,3,4,5,6,7,8,9,10};
        array2[4] = 9001;
        System.out.println(array2);
        newArray[0] = 3;
        newArray[1] = 4;
        newArray[2] = 9;
        newArray[3] = 5;
        newArray[4] = 0;
        String[] strings = {"hello", "there", "world"};
    }
    public static void printArray(int[] myArray){
        for(int i = 0; i < myArray.length; i++){
            System.out.println(myArray[i]);
        }
    }
}