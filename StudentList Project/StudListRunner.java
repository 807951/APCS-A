
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
        String str = sc.nextLine();
        
        switch(str) 
        { 
            case "1": 
                System.out.println("one"); 
                
            case "2": 
                System.out.println("two"); 
            case "3": 
                System.out.println("three"); 
            case "quit":
                break;
            default: 
                System.out.println("Please enter a number."); 
        } 
    }
}
