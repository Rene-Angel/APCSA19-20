
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
    
    public static void practice0(){ //works
        for (int i=0; i<5; i++){            //1 2 3 4 5
            for (int j=1; j<6; j++){        //1 2 3 4 5
                System.out.print(j+" ");    //1 2 3 4 5
            }                               //1 2 3 4 5
            System.out.println();           //1 2 3 4 5
        }
    }
    public static void practice1(){ //works
        for (int row=0; row<6; row++){      //1 
            for (int j=1; j<=row; j++){     //1 2 
                System.out.print(j+" ");    //1 2 3 
            }                               //1 2 3 4 
            System.out.println();           //1 2 3 4 5 
        }
    }
    public static void practice2(){ // Needs work
        for (int i=5; i<6; i++){            //1 2 3 4 5 
            for (int j=1; j>=i; j--){       //1 2 3 4 
                System.out.print(j+" ");    //1 2 3 
            }                               //1 2 
            System.out.println();           //1 
        }
    }
    public static void practice3(){ //works
        for (int i=1; i<6; i++){            //5 4 3 2 1 
            for (int j=5; j>=i; j--){       //5 4 3 2 
                System.out.print(j+" ");    //5 4 3 
            }                               //5 4 
            System.out.println();           //5 
        }
    }
    public static void practice4(){         //1 1 1 1 1 
        for (int i=1; i<6; i++){            //2 2 2 2 
            for (int j=5; j>=i; j--){       //3 3 3 
                System.out.print(i+" ");    //3 3 3 
            }                               //4 4 
            System.out.println();           //5 
        }
    }
    
    public static void whileLoops(){
        int counter = 10;
        while (counter > 0){
            System.out.println("The count is "+counter);
            counter--;
        }
    }
}
