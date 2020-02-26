
/**
 * Write a description of class Classroom here.
 *
 * @author Auckland V
 * @version 2/25/20
 */
import java.util.ArrayList;
public class Classroom{
    ArrayList<Student> studentList;
    public Classroom(){
        studentList = new ArrayList<Student>();
    }
    public void addStudent(Student newStudent){
        studentList.add(newStudent);
    }
    public void sropStudent(int position){
        studentList.remove(position);
    }
    public void dropStudent(Student oldStudent){
        //Find the index of the student
        int pos = 0;
        for(int i = 0; i < studentList.size(); i++){
            if(oldStudent.equals(studentList.get(i))){
                pos = 1;
            }
        }
        //Remove them
        if(pos >= 0){
            studentList.remove(pos);
        }
    }
    public void dropStudent(Integer ID){
        int id = ID.intValue();
        
        int positionOfStudent = -1; //Default is not four
        for(int i = 0; i < studentList.size(); i++){
            if(studentList.get(i).getID() == id){
                positionOfStudent = i;
            }
        }
        if(positionOfStudent >= 0){
            studentList.remove(positionOfStudent);
        }
    }
}
