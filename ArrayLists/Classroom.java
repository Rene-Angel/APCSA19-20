/**
 * Write a description of class Classroom here.
 *
 * @author Rene-Angel Jaime
 * @version (2.25.20)
 */
import java.util.ArrayList;
public class Classroom
{
    ArrayList<Student> studentList;
    public Classroom(){
        studentList = new ArrayList<Student>();
    }
    public void addStudent(Student newStudent){
        studentList.add(newStudent);
    }
    public void dropStudent(int pos){
        studentList.remove(pos);
    }
    public void dropStudent(Student oldStudent){
        // Get the index of the student
        int pos = -1;
        for(int i=0; i < studentList.size(); i++){
            if(oldStudent.equals(studentList.get(i))){
                pos = i;
            }
        }
        // then Remove them
        if(pos>=0){
            studentList.remove(pos);
        }
        
    }
    public void dropStudent(Integer ID){
        for(int i=0; i< studentList.size(); i++){
            if(studentList.get(i).equals(ID)){
                studentList.remove(i);
            }
        }
    }
}
