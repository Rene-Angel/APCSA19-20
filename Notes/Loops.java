
/**
 * @author Rene-Angel Jaime
 * @version (9.10.19)
 */
public class Loops
{
    public static void main(){
        for (int i=0; i<100; i++){
            System.out.println("We did a thing!");
        }
    }
    public static void main2(){
        for (int i=0; i<100; i+=2){
            System.out.println("We did a thing!");
        }
    }
    public static void main3(){
        for (int i=0; i<10; i+=2){
            System.out.println(i);
        }
    }
    public static void main4(){
        for (int i=0; i<10;){
            System.out.println(i);
            i++;
        }
    }
    public static void main5(){
        for (int i=10; i>0; i--){
            System.out.println(i);
        }
    }
    public static void main6(){
        for (int i=0; i<5; i++){
            for (int j=0; j<6; j++){
            System.out.print(j+" ");
            }
            System.out.println();
        }    
    }
}
