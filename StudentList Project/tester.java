
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
    public static void optionTwo(){
        addStudent("a b", 4.6, 123456);
        boolean checkForException = false;
        out.println();
        out.println("Enter 1 to delete the desired student with their last name");
        out.println("Enter 2 to delete the desired student with their ID number");
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
                deleteStudentFromList(lName);
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
                deleteStudentFromList(stuNum);
            break;

            default:
            out.println("Invalid input   -  try again");
            break;
        }            
        printList();
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
    public static void deleteStudentFromList(String lName){
        int[] nums = new int[studs.size()];
        System.out.println(nums);
    }

    public static void deleteStudentFromList(int stuNum){
        ArrayList<Integer> temp = new ArrayList<Integer>();
        for(int i = 0; i < studs.size(); i++){
            if(studs.get(i).getStuNumber() == stuNum){
                temp.add(i);
            }
        }
        sizeCheck:
        if(temp.size() > 2){
            System.out.println("There are " + temp.size() + " students with that student number");
            break sizeCheck;
        }
        else if(temp.size() == 1){
            studs.remove(temp.get(0));
        }
        else{
            System.out.println("There are no students with that ID number");
        }
    }
}
