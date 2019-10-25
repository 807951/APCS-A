
/**
 * runs student list program
 * @author (Arin Gadre)
 * @version (1024)
 * StudListRunner completed: 
Instantiate a StudentList object
Create and call menuNumber method that displays menu, gets user input, and returns the appropriate integer
Select the appropriate StudList method according to user input OR end program 

 */
import java.util.Scanner;
public class StudListRunner
{
    public static void main(){
        menuNumber();
    } 
    public static void menuNumber(){
        StudentList sl = new StudentList();
        Scanner sc = new Scanner(System.in);
        System.out.println("Press one to enter in a new Student");
        System.out.println("Press two to delete in a Student");
        System.out.println("Press three to print out all students");
        System.out.println("Press 'quit' to end program");
        String statement = sc.nextLine();
        while(!statement.equals("quit"))
        {
            if(statement.trim().equals("1")){
                System.out.println("Enter the name of the student.");
                String name = sc.nextLine().trim();
                System.out.println("Enter the student number of the student");
                int stuNum = sc.nextInt();
                System.out.println("Enter the gpa of the student");
                double gpa = sc.nextDouble();
                //sl.addStudent(name, gpa, stuNum);
            }
            else if(statement.trim().equals("2")){
                System.out.println("Enter one to delete the student by their last name");
                System.out.println("Enter two to delete the student by their student number");
                if(sc.nextInt() == 1){
                    System.out.println("Enter the student's lastName");
                    sl.deleteStudentFromList(sc.nextLine().trim());
                }
                else if(sc.nextInt() == 2){
                    System.out.println("Enter the student's student number");
                    sl.deleteStudentFromList(sc.nextInt());
                }
            }
            else if(statement.trim().equals("3")){
                sl.printList();
            }
        }
        sl.printList();
    }
}
