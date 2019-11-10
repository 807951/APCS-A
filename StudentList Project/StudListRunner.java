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
    }

    public static void menuNumber(){
        boolean check;
        do{
            check = false;
            out.println();
            out.println("1 add a new student record");
            out.println("2 delete a student record");
            out.println("3 print a specific student");
            out.println("4 print out all student records");
            out.println("5 delete all students from the record");
            out.println("enter any character to stop the program");
            out.println("After an action is completed, enter any character to return to the main menu");
            try{
                out.print("Enter selection:  ");
                selection = sc.nextInt();
                System.out.println();
            }
            catch(InputMismatchException e){
                out.println("Invalid input   -  try again");
                check = true;
            }
            switch(selection){
                case 1:
                optionOne();
                break;

                case 2:
                optionTwo();
                break;

                case 3:
                optionThree();
                break;

                case 4:
                optionFour();
                break;

                case 5:
                optionFive();
                break;

            }
        } while(check == false);
        System.out.println("program ended");
    }
    // if the user chooses option 5
    public static void optionFive(){
        sl.clearList();
    }
    // if the user chooses option 4
    public static void optionFour(){
        sl.printList();        
    }
    // if the user chooses option 3
    public static void optionThree(){
        boolean checkForException = false;
        out.println();
        out.println("Enter 1 to print the student record using the last name");
        out.println("Enter 2 to print the student record using the student ID number");
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
                out.println();
            }catch(InputMismatchException e){
                out.println("Invalid input   -  try again");
                checkForException = true;
            }
            if(checkForException == false)
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
                checkForException = true;
            }
            if(checkForException == false)
                sl.printStudent(stuNum);
            break;

            default:
            System.out.println("Invalid input  -  try again");
            break;
        }
    }

    // if the user chooses option 2
    public static void optionTwo(){
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
            try{
                out.print("Enter the student's last name");
                lName = sc.nextLine().trim();                
                out.println();
            }catch(InputMismatchException e){
                out.println("Invalid input   -  try again");
                checkForException = true;
            }
            if(checkForException == false)
                sl.deleteStudentFromList(lName);
            break;

            case 2:
            try{
                out.print("Enter the student's ID number");
                stuNum = sc.nextInt();
                sc.nextLine();
                out.println();
            }catch(InputMismatchException e){
                out.println("Invalid input   -  try again");
                checkForException = true;
            }
            if(checkForException == false)
                sl.deleteStudentFromList(stuNum);
            break;

            default:
            out.println("Invalid input   -  try again");
        }
    }
    // if the user chooses option 1
    public static void optionOne(){
        out.println();
        out.print("Enter the new student's name:  ");
        boolean checkForException = false;
        try{
            fullName = sc.nextLine();
        }catch(InputMismatchException e){
            out.println("Invalid input   -  try again");
            checkForException = true;
        }
        out.print("Enter the new student's gpa:  ");
        try{
            gpa = sc.nextDouble();
        }catch(InputMismatchException e){
            out.println("Invalid input   -  try again");
            checkForException = true;
        }
        out.print("Enter the student's ID number:  ");
        try{
            stuNum = sc.nextInt();
            out.println();
        }catch(InputMismatchException e){
            out.println("Invalid input   -  try again");
            checkForException = true;
        }
        if(checkForException == false)
            sl.addStudent(fullName.trim(), gpa, stuNum);
    }
}