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
            System.out.println("press q for quit");
            statement = sc.nextLine().trim();
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
                    statement = sc.nextLine(); 
                    System.out.println("test: " + statement);
                    sl.deleteStudentFromList(statement.trim());
                    break;

                    case 2:
                    System.out.print("Enter the student's ID number: ");   
                    i = sc.nextInt(); 
                    sl.deleteStudentFromList(i);
                    break;

                    default:
                    System.out.println("Please try again.");
                    break;
                }
                break;

                case "3":
                System.out.print('\u000C');
                System.out.println();
                System.out.println("Press 1 to print the student info using the student's last name.");
                System.out.println("Press 2 to print the student info using the student's ID number.");
                i = sc.nextInt();
                sc.nextLine();
                switch(i){
                    case 1:
                    System.out.print("Enter the student's last name: ");
                    statement = sc.nextLine().trim();
                    sl.printStudent(statement);
                    break;

                    case 2:
                    System.out.println("Enter the student's last name: ");
                    break;

                    default:
                    System.out.print("Please try again");
                    break;
                }
                break;

                case "4":
                System.out.print('\u000C');
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

                default :
                System.out.println("Error");
                break;
            }
            if(!statement.equals("4")){
                System.out.print('\u000C');
            }
        } while(!statement.equals("q"));
        System.out.println("program ended");
    }
}
