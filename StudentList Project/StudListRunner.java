/**
 * runs student list program
 * @author (Arin Gadre)
 * @version (1024)
 */
import java.util.Scanner;
public class StudListRunner
{
    public static void main(){
        menuNumber();
        StudentList sl = new StudentList();
        sl.printList();
    } 

    public static void menuNumber(){
        StudentList sl = new StudentList();
        Scanner sc = new Scanner(System.in);
        String statement;
        do{ 
            System.out.println();
            System.out.println("Main Menu:");
            System.out.println("1 add a new student record");
            System.out.println("2 delete student record");
            System.out.println("3 print a student record of one specific student");
            System.out.println("4 print all student records");
            System.out.println("5 edit the information of a student");
            System.out.println("6 clear delete all students from the record");
            System.out.println("7 search by filtering");
            System.out.println("8 sort the students");
            System.out.println("press q for quit");
            statement = sc.nextLine().trim();
            String keepScreen = statement;
            int i = 0;
            switch(statement){
                case "1":
                System.out.print('\u000C');                
                System.out.println("Format 1: First Middle Last");
                System.out.println("Format 2: First Last");
                System.out.println("Format 3: Last, First Middle ");
                System.out.println("Format 4: Last, First");
                System.out.println("Enter the student's name  in one of these these 4 formats:  ");
                String name = sc.nextLine();
                System.out.println("Enter the student's number or ID:  ");
                int id = sc.nextInt();
                System.out.println("Enter the student's gpa ");
                double gpa = sc.nextDouble();       
                sl.addStudent(name, gpa, id);
                break;

                case "2":
                System.out.print('\u000C');
                System.out.println("Press 1 to delete by the student's last name.");
                System.out.println("Press 2 to delete by the student's ID number.");
                i = sc.nextInt();
                sc.nextLine();
                switch(i){
                    case 1:
                    System.out.print("Enter the student's last name: ");    
                    sl.deleteStudentFromList(sc.nextLine().trim());
                    break;

                    case 2:
                    System.out.print("Enter the student's ID number: ");   
                    sl.deleteStudentFromList(sc.nextInt());
                    sc.nextLine();
                    break;

                    default:
                    System.out.println("Please try again.");
                    break;
                }
                break;

                case "3":
                System.out.println();
                System.out.println("Press 1 to print the student info using the student's last name.");
                System.out.println("Press 2 to print the student info using the student's ID number.");
                i = sc.nextInt();
                sc.nextLine();
                switch(i){
                    case 1:
                    System.out.print("Enter the student's last name: ");
                    sl.printStudent(sc.nextLine().trim());
                    break;

                    case 2:
                    System.out.println("Enter the student's ID number: ");
                    sl.printStudent(sc.nextInt());
                    sc.nextLine();
                    break;

                    default:
                    System.out.print("Please try again");
                    break;
                }
                break;

                case "4":
                sl.printList();
                break;

                case "5":
                System.out.print('\u000C');
                System.out.println("Enter 1 to change a student by their last name.");
                System.out.println("Enter 2 to change a student by their ID number");
                i = sc.nextInt();
                sc.nextLine();
                switch(i){
                    case 1:
                    System.out.println("Enter the student's last name: ");
                    name = sc.nextLine().trim();
                    System.out.println("Enter the student's new gpa: ");
                    gpa = sc.nextDouble();
                    sc.nextLine();
                    System.out.println("Enter the student's revised name: ");
                    String newName = sc.nextLine().trim();
                    sl.editStudentList(name, gpa, newName);
                    break;

                    case 2: 
                    System.out.println("Enter the student's ID number ");
                    int stuNumber = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter the student's new gpa: ");
                    gpa = sc.nextDouble();
                    sc.nextLine();
                    System.out.println("Enter the student's revised name: ");
                    newName = sc.nextLine().trim();

                    sl.editStudentList(stuNumber, gpa, newName);
                    break;

                    default:
                    System.out.println("Please try again.");
                    break;
                }
                break;

                case "6":
                System.out.print('\u000C');
                sl.clearList();
                break;

                case "7":
                System.out.println("Enter 1 to find all students that have a gpa less than or equal to what you will enter.");
                System.out.println("Enter 2 to find all students that have a gpa more than or equal to what you will enter.");
                System.out.println("Enter 3 to find all students that have a student ID number less than or equal to what you will enter.");
                System.out.println("Enter 4 to find all students that have a student ID number more than than or equal to what you will enter.");
                i = sc.nextInt();
                sc.nextLine();
                switch(i){
                    case 1:
                    System.out.println("Enter in the gpa to filter the results: ");
                    sl.filterSearchStudentListLessThan(sc.nextDouble());
                    sc.nextLine();
                    break;
                    
                    case 2:
                    System.out.println("Enter in the gpa to filter the results: ");
                    sl.filterSearchStudentListMoreThan(sc.nextDouble());
                    sc.nextLine();
                    break;
                    
                    case 3:
                    System.out.println("Enter in the student ID number to filter the results: ");
                    sl.filterSearchStudentListLessThan(sc.nextInt());
                    sc.nextLine();
                    break;
                    
                    case 4:
                    System.out.println("Enter in the gpa to filter the results: ");
                    sl.filterSearchStudentListMoreThan(sc.nextInt());
                    sc.nextLine();
                    
                    default:
                    System.out.println("Please try again, and enter a number 1 through 4");
                }
                break;
                
                case "8":
                
                System.out.println("Enter 1 to sort the students based on last name");
                System.out.println("Enter 2 to sort the students based on their ID number");
                if(sc.nextInt() == 1){
                  sl.sortByLastName();
                }
                else if(sc.nextInt() == 2){
                    sl.sortByStuNumber();
                }
                else{
                    System.out.println("Please try again, and try to enter 1 or 2");
                }
                sc.nextLine();
                break;
                
                default :
                System.out.println("Enter a whole number 1 through 8 to try again.");
                break;
            }
            if(!keepScreen.equals("4") || !keepScreen.equals("3") 
            || !keepScreen.equals("7")){
                System.out.print('\u000C');
            }
        } while(!statement.equals("q"));
        System.out.println("program ended");
    }
}