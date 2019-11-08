/**
 * runs student list program
 * @author (Arin Gadre)
 * @version (1024)
 */
import java.util.InputMismatchException;
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
        String statement = "";
        boolean keepScreen = false;
        do{
            
        } while(!statement.equals("q"));
        System.out.println("program ended");
    }
}