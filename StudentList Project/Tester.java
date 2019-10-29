/**
 * Write a description of class Tester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class Tester
{
    static ArrayList<Student> students = new ArrayList<Student>();
    public static void main(){
        addStudent("Arin Abhay Gadre", 1.0, 4);
        addStudent("vibe check", 2.0, 3);
        addStudent("Arin Zeta", 3.0, 2);
        addStudent("joe mama", 4.0, 1);

        printList();
    }

    public static void printList(){
        for(int i = 0; i < students.size(); i++){
            System.out.println("Student name: " + students.get(i).getFullName());
            System.out.println(" Student gpa: " + students.get(i).getGPA());
            System.out.println(" Student number: " + students.get(i).getStuNumber());
        }
    }

    public static void parseUserInput(String userName, Student s){
        String[] arr = userName.split(" "); 
        int commaIndex = arr[0].indexOf(',');
        if(arr.length > 4 || arr.length < 2){
            System.out.println("Name was entered in the wrong format.");
        }else if(arr.length == 3){
            if(commaIndex == -1){  // 
                // comma index = -1 means there is no comma in the name
                s.setFName(arr[0]);
                s.setMName(arr[1]);
                s.setLName(arr[2]);
            }
            else{
                arr[0] = arr[0].substring(0, commaIndex);
                s.setFName(arr[2]);
                s.setMName(arr[1]);
                s.setLName(arr[0]);
            }
        }else{
            if(commaIndex == -1){
                // comma index = -1 means there is no comma in the name
                s.setFName(arr[0]);
                s.setLName(arr[1]);
                s.setMName("");               
            }
            else{
                arr[0] = arr[0].substring(0, commaIndex);
                s.setFName(arr[1]);
                s.setLName(arr[0]);
                s.setMName("");
            }
        }
    }

    public static void addStudent(String fullName, double gpa, int stuNum){
        Student s = new Student(fullName, gpa, stuNum);
        parseUserInput(fullName, s);
        ///System.out.println("Gpa: " + s.getGPA());
        /// System.out.println("Student Number: " + s.getStuNumber());
        // System.out.println("Name: " + s.getFullName());
        students.add(s);
    }

    

    public static void printList(ArrayList<Student> students){
        for(int i = 0; i < students.size(); i++){
            System.out.println("Student name: " + students.get(i).getFullName());
            System.out.println(" Student gpa: " + students.get(i).getGPA());
            System.out.println(" Student number: " + students.get(i).getStuNumber());
        }
    }
}

