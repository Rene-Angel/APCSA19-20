/**
 * Write a description of class Classroom here.
 *
 * @author Rene-Angel Jaime
 * @version (2.25.20)
 */
import java.util.ArrayList;
import java.util.List;
public class Classroom
{
    List<Student> studentList;
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
        int id = ID.intValue();
        int positionOfStudent = -1; // Default is not found.
        for(int i=0; i< studentList.size(); i++){
            if(studentList.get(i).getID() == id){
                positionOfStudent = i;
            }
        }
        // then remove them
        if(positionOfStudent >= 0){
            studentList.remove(positionOfStudent);
        }
    }
    public Student changeFirstStudent(Student student){
        Student newStudent = studentList.set(0, student);
        return newStudent;
    }
}
