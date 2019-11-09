/**
 * runs student list program by getting user input
 * @author (Arin Gadre)
 * @version (1108)
 */
import java.util.InputMismatchException;
import java.util.Scanner;
import static java.lang.System.out;
public class StudListRunner
{
    private static StudentList sl = new StudentList();
    private static Scanner sc = new Scanner(System.in);
    private static String statement = "";
    private static int selection = 0;
    private static boolean keepScreen = false;
    private static String lName = "";
    private static String fullName = "";
    private static double gpa = 0.0;
    private static int stuNum = 0;
    public static void main(){
        menuNumber();
        StudentList sl = new StudentList();
        sl.printList();
    }

    public static void menuNumber(){
        do{
            out.println("1 add a new student record" +
                        "2 delete a student record" +
                        "3 print a specific student" +
                        "4 print out all student records" +
                        "5 delete a specific student from the record" +
                        "6 delete all students from the record" +
                        "press q to exit the program");
            try{
                out.print("Enter selection:  ");
                statement = sc.nextLine().trim();
                System.out.println();
                switch(statement){
                    case "1":
                    optionOne();
                    break;

                    case "2":
                    optionTwo();
                    break;
                    
                    case "3":
                    optionThree();
                    break;
                    
                    
                }
            }
            catch(InputMismatchException e){
                out.println("Invalid input   -  try again");
            }
        } while(!statement.equals("q"));
        System.out.println("program ended");
    }
    // if the user chooses option 4
    public static void optionFour(){
        sl.printList();
    }
    // if the user chooses option 3
    public static void optionThree(){
        out.println("Enter 1 to print the student record using the last name" +
            "Enter 2 to print the student record using the student ID number");
        try{
            selection = sc.nextInt();
            sc.nextLine();
        }catch(InputMismatchException e){
            out.println("Invalid input   -  try again");
        }
        switch(selection){
            case 1:
            out.print("Enter the student's last name:  ");
            try{
                lName = sc.nextLine().trim();
                out.println();
            }catch(InputMismatchException e){
                out.println("Invalid input   -  try again");
            }
            sl.printStudent(lName);
            break;

            case 2:
            out.print("Enter the student's ID number:  ");
            try{
                stuNum = sc.nextInt();
                sc.nextLine();
                out.println();
            }catch(InputMismatchException e){
                out.println("Invalid input   -  try again");
            }
            sl.printStudent(stuNum);
            break;
            
            default:
            System.out.println("Invalid input  -  try again");
            break;
        }
    }

    // if the user chooses option 2
    public static void optionTwo(){
        out.println("Enter 1 to delete the desired student with their last name" +
            "Enter 2 to delete the desired student with their ID number");
        try{
            selection = sc.nextInt();
            sc.nextLine();
        }catch(InputMismatchException e){
            out.println("Invalid input   -  try again");
        }
        switch(selection){
            case 1: 
            try{
                out.print("Enter the student's last name");
                sl.deleteStudentFromList(sc.nextInt());
                out.println();
            }catch(InputMismatchException e){
                out.println("Invalid input   -  try again");
            }
            break;

            case 2:
            try{
                out.print("Enter the student's ID number");
                sl.deleteStudentFromList(sc.nextInt());
                sc.nextLine();
                out.println();
            }catch(InputMismatchException e){
                out.println("Invalid input   -  try again");
            }
            break;

            default:
            out.println("Invalid input   -  try again");
        }
    }
    // if the user chooses option 1
    public static void optionOne(){
        out.print("Enter the new student's name:  ");
        try{
            fullName = sc.nextLine();
            out.println();
        }catch(InputMismatchException e){
            out.println("Invalid input   -  try again");
        }
        out.print("Enter the new student's gpa:  ");
        try{
            gpa = sc.nextDouble();
            sc.nextLine();
            out.println();
        }catch(InputMismatchException e){
            out.println("Invalid input   -  try again");
        }
        out.print("Enter the student's ID number:  ");
        try{
            stuNum = sc.nextInt();
            sc.nextInt();
            out.println();
        }catch(InputMismatchException e){
            out.println("Invalid input   -  try again");
        }
        sl.addStudent(fullName.trim(), gpa, stuNum);
    }
}