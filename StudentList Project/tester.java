
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
    private static double gpa = 0.0;
    private static int stuNum = 0;
    private static ArrayList<Student> studs = new ArrayList<Student>();
    public static void optionThree(){
        studs.clear();
        studs.add(new Student("a b", 1.0, 1));
        studs.add(new Student("c d", 2.0, 2));
        boolean checkForException = false;
        out.println();
        out.println("Enter 1 to print the desired student with their last name");
        out.println("Enter 2 to print the desired student with their ID number");
        try{
            selection = sc.nextInt();
            sc.nextLine();
        }catch(InputMismatchException e){
            out.println("Invalid input   -  try again");
            checkForException = true;
        }
        switch(selection){
            case 1:
            out.print("Enter the student's last name:  ");
            try{
                lName = sc.nextLine().trim();
            }catch(InputMismatchException e){
                out.println("Invalid input   -  try again");
                checkForException = true;
            }
            if(checkForException == false)
                printStudent(lName);
            break;

            case 2:
            out.print("Enter the student's ID number:  ");
            try{
                stuNum = sc.nextInt();
            }catch(InputMismatchException e){
                out.println("Invalid input   -  try again");
                checkForException = true;
            }
            if(checkForException == false)
                printStudent(stuNum);
            break;

            default:
            out.println("Invalid input   -  try again");
            break;
        }
    }

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
        }
    }

    public static void printStudent(int stuNum){
        ArrayList<Student> stud = new ArrayList<Student>();
        for(int i = 0; i < studs.size(); i++){
            if(studs.get(i).getStuNumber() == stuNum){
                stud.add(studs.get(i));
            }
        }
        if(stud.size() > 2){
            System.out.println("There are " + stud.size() + " students with that ID number");
        }
        else if(stud.size() == 1){
            printList(stud);
        }
        else{
            System.out.println("There are no students with that ID number");
        }
    }

    public static void printStudent(String str){
        ArrayList<Student> stud = new ArrayList<Student>();
        for(int i = 0; i < studs.size(); i++){
            if(studs.get(i).getFullName().indexOf(str.trim()) != -1){
                stud.add(studs.get(i));
            }
        }
        if(stud.size() > 1)
            out.println("There are " + stud.size() + " students with that last name");
        else if(stud.size() == 1)
            printList(stud);
        else
            out.println("There are no students with a last name of " + str);
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
