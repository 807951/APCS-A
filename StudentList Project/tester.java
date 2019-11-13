
/**
 * Write a description of class tester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
import static java.lang.System.out;
public class tester
{
    private static StudentList sl = new StudentList();
    private static Scanner sc = new Scanner(System.in);
    private static String statement = "";
    private static int selection = 0;
    private static String lName = "";
    private static String fullName = "";
    private static String newName = "";
    private static double gpa = 0.0;
    private static int stuNum = 0;
    private static ArrayList<Student> studs = new ArrayList<Student>();

    public static void addStudent(String fullName, double gpa, int stuNum){
        studs.add(new Student(fullName, gpa, stuNum));
    }

    public static void printList(){
        for(int i = 0; i < studs.size(); i++){
            System.out.println("Student name: " +
                studs.get(i).getFullName());
            System.out.println("Student gpa: " + studs.get(i).getGPA());
            System.out.println("Student number: " +
                studs.get(i).getStuNumber());
            out.println();
        }
    }

    public static void sortByLastName()
    {
        out.println();
        out.println("Before sorting");
        studs.add(new Student("g h",4.0, 4));
        studs.add(new Student("e f", 3.0, 3));
        studs.add(new Student("c d", 2.0, 2));
        studs.add(new Student("a b", 1.0, 1));
        printList();
        out.println();
        int n = studs.size();
        for (int j=0; j<n-1; j++)
        {
            // bubble sort using compareTo method
            for (int i=j+1; i<n; i++)
            {
                Student temp;
                if(studs.get(j).getLName().compareTo(studs.get(i).getLName()) > 0)
                {
                    temp = studs.get(j);
                    studs.set(j, studs.get(i));
                    studs.set(i, temp);
                }
            }
        }
    }

    public static void sortByStuNumber(){
        for (int i = 0; i < studs.size(); i++) {
            // find position of smallest num between (i + 1)th elemen and last element
            int pos = i;
            for (int j = i; j < studs.size(); j++) {
                if (studs.get(j).getStuNumber() <
                studs.get(pos).getStuNumber())
                    pos = j;
            }
            // Swap min (smallest num) to current position on array
            Student min = studs.get(pos);
            studs.set(pos, studs.get(i));
            studs.set(i, min);
        }
    }

    public static void printList(ArrayList<Student> students){
        for(int i = 0; i < students.size(); i++){
            System.out.println("Student name:  " +
                students.get(i).getFullName());
            System.out.println("Student gpa:  " + 
                students.get(i).getGPA());
            System.out.println("Student number:  " +
                students.get(i).getStuNumber());
        }
    }
}
