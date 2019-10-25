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
        for(int i = 0; i < students.size(); i++){
            if(students.get(i).getStuNumber() == stuNum){
                students.remove(i);
            }
        }
    }
    public void printList(){
        for(int i = 0; i < students.size(); i++){
            System.out.println("Student name: " + students.get(i).getFullName() + "Student gpa: " + students.get(i).getGPA()
            + "Student number: " + students.get(i).getStuNumber());
        }
    }
    public void parseUserInput(String userName, Student s){
        String[] arr = userName.split(" "); 
        int commaIndex = arr[0].indexOf(',');
        label:
        if(arr.length < 2 || arr.length > 3){
            System.out.println("Looks like you entered the name in the wrong format!");
            break label;
        }
        else{
            if(arr.length == 3){
                if(commaIndex != -1){
                    arr[0] = arr[0].substring(0, commaIndex);
                    s.setFName(arr[2]);
                    s.setMName(arr[1]);
                    s.setLName(arr[0]);
                }
                else if(commaIndex == -1){
                    s.setFName(arr[0]);
                    s.setMName(arr[1]);
                    s.setLName(arr[2]);
                }
            }
            else if(arr.length == 2){
                if(commaIndex != -1){
                    arr[0] = arr[0].substring(0, commaIndex);
                    s.setFName(arr[1]);
                    s.setLName(arr[0]);
                    s.setMName("");
                }
                else if(commaIndex == -1){
                    s.setFName(arr[0]);
                    s.setLName(arr[1]);
                    s.setMName("");               
                }
            }
        }
    }
    public void clearList(){
        students.clear();
    }
}