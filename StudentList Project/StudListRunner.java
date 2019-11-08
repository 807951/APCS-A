/**
 * runs student list program
 * @author (Arin Gadre)
 * @version (1024)
 */
import java.util.InputMismatchException;
import java.util.Scanner;
import static java.lang.System.out;
public class StudListRunner
{
    private StudentList sl = new StudentList();
    private Scanner sc = new Scanner(System.in);
    private static String statement;
    private final int OPTION_ONE = 1;
    private final int OPTION_TWO = 2;
    private final int OPTION_THREE = 3;
    private final int OPTION_FOUR = 4;
    private final int OPTION_FIVE = 5;
    private final int OPTION_SIX = 6;
    public static void main(){
        menuNumber();
        StudentList sl = new StudentList();
        sl.printList();
    }
    
    public static void menuNumber(){
        boolean keepScreen = false;
        statement = "";
        do{
            System.out.println("1 add a new student record" +
                               "2 delete a student record" +
                               "3 print a student record to the console" +
                               "4 search for a student by name or student number" +
                               "5 delete a specific student from the record" +
                               "6 delete all students from the record");
            try{
                
            }
        } while(!statement.equals("q"));
        System.out.println("program ended");
    }
}