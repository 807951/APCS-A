/**
 * runs student list program by getting user input
 * @author (Arin Gadre)
 * @version (1112)
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
    private static String lName = "";
    private static String fullName = "";
    private static double gpa = 0.0;
    private static int stuNum = 0;
    private static String newName;
    private static boolean keepScreen = false;
    public static void main(){
        menuNumber();
    }

    public static void menuNumber(){
        boolean check;
        do{
            if(keepScreen != false)
                out.print('\u000c');
            check = false;
            out.println("1 add a new student record\n2 delete a student record\n3 print a specific student\n4 print out all student records\n5 delete all students from the record\n6 To edit a student's info\n7 Sort the students\n8 Revert back to unsorted array");
            try{
                out.println("Enter selection:  ");
                selection = sc.nextInt();
                System.out.println();
            }
            catch(InputMismatchException e){
                out.println("Invalid input   -  try again");
                check = true;
            }
            if(check == false){
                switch(selection){
                    case 1:
                    out.print('\u000c');
                    optionOne();
                    break;

                    case 2:
                    out.print('\u000c');
                    optionTwo();
                    break;

                    case 3:
                    keepScreen = true;
                    out.print('\u000c');
                    optionThree();
                    break;

                    case 4:
                    keepScreen = true;
                    out.print('\u000c');
                    optionFour();
                    break;

                    case 5:
                    out.print('\u000c');
                    optionFive();
                    break;

                    case 6:
                    out.print('\u000c');
                    optionSix();
                    break;

                    case 7:
                    out.print('\u000c');
                    optionSeven();
                    break;

                    case 8:
                    keepScreen = true;
                    out.print('\u000c');
                    optionEight();
                    break;

                    default:
                    out.println("Invalid input   -  try again");
                    break;
                }
            }
        } while(check == false);
        System.out.println("program ended");
    }

    // if the user chooses option 9

    public static void optionNine(){
        boolean checkForException = false;
        out.println("Enter 1 to find all students who have a gpa more than or equal to what you enter" + 
            "\nEnter 2 to find all students who have a gpa less than or equal to what you enter" +
            "\nEnter 3 to find all students who have a ID number more than or equal to what you enter" +
            "\nEnter 4 to find all students who have a ID number less than or equal to what you enter");
        try{
            selection = sc.nextInt();
            sc.nextLine();
        }catch(InputMismatchException e){
            out.println("Invalid input   -  try again");
            checkForException = true;
        }
        switch(selection){
            case 1:
            out.println("Enter a gpa:");
            try{
                gpa = sc.nextDouble();
                sc.nextLine();
            }catch(InputMismatchException e){
                out.println("Invalid input   -  try again");
                checkForException = true;
            }
            if(checkForException == false)
                sl.filterSearchStudentListMoreThan(gpa);
            break;

            case 2:
            out.println("Enter a gpa:");
            try{
                gpa = sc.nextDouble();
                sc.nextLine();
            }catch(InputMismatchException e){
                out.println("Invalid input   -  try again");
                checkForException = true;
            }
            if(checkForException == false)
                sl.filterSearchStudentListLessThan(gpa);
            break;

            case 3:
            out.println("Enter a ID number:");
            try{
                stuNum = sc.nextInt();
                sc.nextLine();
            }catch(InputMismatchException e){
                out.println("Invalid input   -  try again");
                checkForException = true;
            }
            if(checkForException == false)
                sl.filterSearchStudentListMoreThan(stuNum);
            break;

            case 4:
            out.println("Enter a ID number:");
            try{
                stuNum = sc.nextInt();
                sc.nextLine();
            }catch(InputMismatchException e){
                out.println("Invalid input   -  try again");
                checkForException = true;
            }
            if(checkForException == false)
                sl.filterSearchStudentListLessThan(stuNum);
            break;
        }
    }

    // if the user chooses option 8
    public static void optionEight(){
        sl.unsort();
    }

    // if the user chooses option 7
    public static void optionSeven(){
        boolean checkForException = false;
        out.println("Enter 1 to sort the student by last name\nEnter 2 to sort the student by their gpa");
        try{
            selection = sc.nextInt();
            sc.nextLine();
        }catch(InputMismatchException e){
            out.println("Invalid input   -  try again");
            checkForException = true;
        }
        if(selection == 1 && checkForException == false)
            sl.sortByLastName();
        else if(selection == 2 && checkForException == false)
            sl.sortByStuNumber();
        else
            out.println("Invalid input   -  try again");
    }

    // if the user chooses option 6

    public static void optionSix(){
        boolean checkForException = false;
        out.println("To find a student based on their ID number and edit the student's name or gpa, press 1" 
            + "\nTo find a student based on their last name and edit the student's name or gpa, press 2");
        try{
            selection = sc.nextInt();
            sc.nextLine();
        }catch(InputMismatchException e){
            out.println("Invalid input   -  try again");
            checkForException = true;
        }
        switch(selection){
            case 1:
            out.println("Enter the student's ID number:  ");
            try{
                stuNum = sc.nextInt();
                sc.nextLine();
            }catch(InputMismatchException e){
                out.println("Invalid input   -  try again");
                checkForException = true;
            }
            out.println("Enter the student's new gpa:  ");
            try{
                gpa = sc.nextDouble();
                sc.nextLine();
            }catch(InputMismatchException e){
                out.println("Invalid input   -  try again");
                checkForException = true;
            }
            out.println("Enter the student's new name:  ");
            try{
                newName = sc.nextLine();
            }catch(InputMismatchException e){
                out.println("Invalid input   -  try again");
                checkForException = true;
            }
            if(checkForException == false)
                sl.editStudentList(stuNum, gpa, newName);
            break;

            case 2:
            out.println("Enter the student's last name:  ");
            try{
                lName = sc.nextLine();
            }catch(InputMismatchException e){
                out.println("Invalid input   -  try again");
                checkForException = true;
            }
            out.println("Enter the student's new gpa:  ");
            try{
                gpa = sc.nextDouble();
                sc.nextLine();
            }catch(InputMismatchException e){
                out.println("Invalid input   -  try again");
                checkForException = true;
            }
            out.println("Enter the student's new name:  ");
            try{
                newName = sc.nextLine();
            }catch(InputMismatchException e){
                out.println("Invalid input   -  try again");
                checkForException = true;
            }
            if(checkForException == false)
                sl.editStudentList(lName, gpa, newName);
            break;

            default:
            out.println("Invalid input   -  try again");
            break;
        }
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
            out.println("Enter the student's last name:  ");
            try{
                lName = sc.nextLine().trim();
            }catch(InputMismatchException e){
                out.println("Invalid input   -  try again");
                checkForException = true;
            }
            if(checkForException == false)
                sl.printStudent(lName);
            break;

            case 2:
            out.println("Enter the student's ID number:  ");
            try{
                stuNum = sc.nextInt();
            }catch(InputMismatchException e){
                out.println("Invalid input   -  try again");
                checkForException = true;
            }
            if(checkForException == false)
                sl.printStudent(stuNum);
            break;

            default:
            out.println("Invalid input   -  try again");
            break;
        }
    }
    // if the user chooses option 2
    public static void optionTwo(){
        boolean checkForException = false;
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
            out.println("Enter the student's last name:  ");
            try{
                lName = sc.nextLine().trim();
            }catch(InputMismatchException e){
                out.println("Invalid input   -  try again");
                checkForException = true;
            }
            if(checkForException == false)
                sl.deleteStudentFromList(lName);
            break;

            case 2:
            out.println("Enter the student's ID number:  ");
            try{
                stuNum = sc.nextInt();
            }catch(InputMismatchException e){
                out.println("Invalid input   -  try again");
                checkForException = true;
            }
            if(checkForException == false)
                sl.deleteStudentFromList(stuNum);
            break;

            default:
            out.println("Invalid input   -  try again");
            break;
        }            
    }
    // if the user chooses option 1
    public static void optionOne(){
        boolean checkForException = false;
        out.println("Format 1: First Middle Last\nFormat 2: First Last\nFormat 3: Last, First Middle\nFormat 4: Last, First\nEnter the student's name in one of these 4 formats\nEnter the new student's name:  ");
        out.println("enter the student's full name in one of those formats:  ");
        try{
            fullName = sc.nextLine();
        }catch(InputMismatchException e){
            out.println("Invalid input   -  try again");
            checkForException = true;
        }     
        out.println("Enter the student's gpa:  ");
        try{
            gpa = sc.nextDouble();
            sc.nextLine();
        }catch(InputMismatchException e){
            out.println("Invalid input   -  try again");
            checkForException = true;
        }
        out.println("Enter the student's ID number:  ");
        try{
            stuNum = sc.nextInt();
            sc.nextLine();
        }catch(InputMismatchException e){
            out.println("Invalid input   -  try again");
            checkForException = true;
        }
        if((fullName.matches(".*\\d.*") == false) && (checkForException == false))
            sl.addStudent(fullName, gpa, stuNum);

        else
            out.println("Invalid input   -  try again");
    }
}