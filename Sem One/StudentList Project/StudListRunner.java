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
    private static boolean keepScreen;
    private static StudentList sl = new StudentList();
    private static Scanner sc = new Scanner(System.in);
    private static String statement = "";
    private static int selection = 0;
    private static String lName = "";
    private static String fullName = "";
    private static double gpa = 0.0;
    private static int stuNum = 0;
    private static String newName;
    public static void main(){
        menuNumber();
    }

    public static void clearScreen(){
        out.print('\u000C');
    }

    public static void menuNumber(){
        boolean check;
        do{
            if(keepScreen == false){
                out.print('\u000C');
            }
            check = false;
            out.println(
              "1 add a new student record " +
            "\n2 delete a student record" + 
            "\n3 print a specific student" + 
            "\n4 print out all student records" + 
            "\n5 delete all students from the record" + 
            "\n6 edit a student's record" + 
            "\n7 sort the students" +
            "\n8 filter search the students" + 
            "\n9 revert the students back to an unsorted form");
            try{
                out.println("Enter selection:  ");
                selection = sc.nextInt();
            }
            catch(InputMismatchException e){
                out.println("Invalid input   -  try again");
                check = true;
            } 
            if(check == false){
                switch(selection){
                    case 1:
                    out.print('\u000C');
                    optionOne();
                    break;

                    case 2:
                    out.print('\u000C');
                    optionTwo();
                    break;

                    case 3:
                    keepScreen = true;
                    out.print('\u000C');
                    optionThree();
                    break;

                    case 4:
                    keepScreen = true;
                    out.print('\u000C');
                    optionFour();
                    break;

                    case 5:
                    out.print('\u000C');
                    optionFive();
                    break;

                    case 6:
                    out.print('\u000C');
                    optionSix();
                    break;

                    case 7:
                    out.print('\u000C');
                    optionSeven();
                    break;

                    case 8:
                    keepScreen = true;
                    out.print('\u000C');
                    optionEight();
                    break;

                    case 9:
                    out.print('\u000C');
                    optionNine();
                    
                    default:
                    out.print('\u000C');
                    out.println("Invalid input   -  try again");
                    break;
                }
            }
            //selection = 0;
        } while(check == false);
        System.out.println("program ended");
    }

    // if the user chooses option 9
    public static void optionNine(){
        sl.unSort();
    }
    
    // if the user chooses option 8
    public static void optionEight(){
        boolean checkForException = false;
        out.println("Enter 1 to find all students who have a gpa less than or equal to what you enter" +
            "\nEnter 2 to find all students who have a gpa more than or equal to what you enter" +
            "\nEnter 3 to find all find all students who have a ID number less than or equal to what you enter" +
            "\nEnter 4 to find all students who have a ID number more than or equal to what you enter");
        try{
            selection = sc.nextInt();
            sc.nextLine();
        }catch(InputMismatchException e){
            out.println("Invalid input   -  try again");
            checkForException = true;
        }
        switch(selection){
            case 1:
            out.println("Enter a gpa:  ");
            try{
                gpa = sc.nextDouble();
                sc.nextLine();
                out.println(gpa);
            }catch(InputMismatchException e){
                out.println("Invalid input   -  try again");
                checkForException = true;
            }
            sl.filterSearchStudentListLessThan(gpa);
            break;

            case 2:
            out.println("Enter a gpa:  ");
            try{
                gpa = sc.nextDouble();
                sc.nextLine();
            }catch(InputMismatchException e){
                out.println("Invalid input   -  try again");
                checkForException = true;
            }
            sl.filterSearchStudentListMoreThan(gpa);
            break;

            case 3:
            out.println("Enter a ID number:  ");
            try{
                stuNum = sc.nextInt();
                sc.nextLine();
            }catch(InputMismatchException e){
                out.println("Invalid input   -  try again");
                checkForException = true;
            }
            sl.filterSearchStudentListLessThan(stuNum);
            break;

            case 4:
            out.println("Enter a ID number:  ");
            try{
                stuNum = sc.nextInt();
                sc.nextLine();
            }catch(InputMismatchException e){
                out.println("Invalid input   -  try again");
                checkForException = true;
            }
            sl.filterSearchStudentListMoreThan(stuNum);
            break;

            default:
            out.println("Invalid input   -  try again");
            break;
        }
    }

    // if the user chooses option 7
    public static void optionSeven(){
        boolean checkForException = false;
        out.println("To sort the students based on their last name, press 1" 
            + "\nTo sort the student based on their ID number, press 2");
        try{
            selection = sc.nextInt();
            sc.nextLine();
        }catch(InputMismatchException e){
            out.println("Invalid input   -  try again");
            checkForException = true;
        }
        switch(selection){
            case 1:
            sl.sortByLastName();
            break;

            case 2:
            sl.sortByStuNumber();
            break;

            default:
            out.println("Invalid input   -  try again");
            break;
        }
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
        try{
            sc.nextLine();
            fullName = sc.nextLine();
        }catch(InputMismatchException e){
            out.println("Invalid input   -  try again");
            checkForException = true;
        }     
        try{
            out.println("Enter the student's gpa:  ");
            gpa = sc.nextDouble();
        }catch(InputMismatchException e){
            out.println("Invalid input   -  try again");
            checkForException = true;
        }
        out.println("Enter the student's ID number:  ");
        try{
            stuNum = sc.nextInt();
        }catch(InputMismatchException e){
            out.println("Invalid input   -  try again");
            checkForException = true;
        }
        if((fullName.matches(".*\\d.*") == false) && (checkForException == false)){
            sl.addStudent(fullName, gpa, stuNum);
        }
        else{
            out.println("Invalid input   -  try again");
        }
    }
}

