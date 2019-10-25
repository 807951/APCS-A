/**
 * makes studentlist methods
 * @author (Arin Gadre)
 * @version (1024)
 * Helper method parseUserInput() in the StudentList class,  
 * that will take a String and Student Object and set the instance variables 
 * in the student object according to the user input string. 
 * (e.g. firstName, middleName, and lastName)
 */
import java.util.ArrayList;
public class StudentList
{
    private ArrayList<Student> students = new ArrayList<Student>();
    public void addStudent(String fullName, double gpa, int stuNum){
        //students.add(fullName, gpa, stuNum);
    }
    public void deleteStudentFromList(String lName){
        for(int i = 0; i < students.size(); i++){
            if(students.get(i).getLName().equals(lName)){
                students.remove(i);
            }
        }
    }
    public void deleteStudentFromList(int stuNum){
        boolean check = false;
        int temp = 0;;
        for(int i = 0; i < students.size(); i++){
            if(students.get(i).getStuNumber() == stuNum){
                check = true;
                temp = i;
            }
            else{
                check = false;
            }
        }
        if(check = true){
            students.remove(temp);
        }
        else{
            throw new ArithmeticException("Student does not exist");
        }
    }
    public void printList(){
        for(int i = 0; i < students.size(); i++){
            System.out.println("Student name: " + students.get(i).getFullName() + "Student gpa: " + students.get(i).getGPA()
            + "Student number: " + students.get(i).getStuNumber());
        }
    }
    public void clearList(){
        students.clear();
    }
}