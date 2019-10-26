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
    public static void sortByLastName() 
    { 
        int n = students.size();
        for (int j=0; j<n-1; j++) 
        { 
            for (int i=j+1; i<n; i++) 
            { 
                Student temp = new Student();
                if (students.get(j).getLName().compareTo(students.get(i).getLName()) > 0) 
                { 
                    temp = students.get(j); 
                    students.set(j, students.get(i)); 
                    students.set(i, temp);
                } 
            } 
        } 

    } 
    public static void printList(){
        for(int i = 0; i < students.size(); i++){
            System.out.println("Student name: " + students.get(i).getFullName());
            System.out.println(" Student gpa: " + students.get(i).getGPA());
            System.out.println(" Student number: " + students.get(i).getStuNumber());
        }
    }
    public static void main(){
        students.add(new Student("Arin Abhay Gadre", 3.44, 123456));
        students.add(new Student("Arin Ron", 3.44, 123456));
        students.add(new Student("Arin Zeta", 3.44, 123456));
        sortByLastName();
        printList();
    }
}
