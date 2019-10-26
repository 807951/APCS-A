/**
 * runs student list program
 * @author (Arin Gadre)
 * @version (1024)
 *
 */
import java.io.IOException;
import java.util.Scanner;
public class StudListRunner
{
    public static void main(){
        menuNumber();
    } 

    public static void menuNumber(){
        StudentList sl = new StudentList();
        Scanner sc = new Scanner(System.in);
        String statement;
        do{ 
            System.out.println("1 add a new student record");
            System.out.println("2 delete student record");
            System.out.println("3 print a student record of one specific student");
            System.out.println("4 print all student records");
            System.out.println("5 search for a student by name or student number");
            System.out.println("6 clear delete all students from the record)");
            System.out.println("press q for quit");
            statement = sc.nextLine();
            switch(statement){
                case "1":
                int stuNum;
                double gpa;
                String name;
                System.out.println("Format 1: First Middle Last");
                System.out.println("Format 2: First Last");
                System.out.println("Format 3: Last, First Middle ");
                System.out.println("Format 4: Last, First");
                System.out.println("Enter the student's name  in one of these these 4 formats:  ");
                /*statement = sc.nextLine();
                name = statement;
                System.out.println("Enter the student's number or ID:  ");
                statement = sc.nextLine();
                stuNum = Integer.parseInt(statement);
                System.out.println("Enter the student's gpa ");
                statement = sc.nextLine();
                gpa = Double.parseDouble(statement);
                sl.addStudent(name, gpa, stuNum);*/
                break;
                default :
                System.out.println("Default");
            }
            System.out.print('\u000C');
        } while(!statement.equals("q"));
        System.out.println("program ended");
    }
}
