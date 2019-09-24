/**
 * uses parseName method
 *
 * @author (Arin Gadre)
 * @version (923)
 */
import java.util.Scanner;
public class Runner
{
    public static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name in the format: First, Middle, Last");
        Person p = new Person(sc.nextLine());
        p.parseArray();
        System.out.println("Your First Name: " + p.getFirstName());
        System.out.println("Your Middle Name: " + p.getMiddleName());
        System.out.println("Your Last Name: " + p.getLastName());
    }
}
