/**
 * runs parseArray and extendArray method
 * @author (Arin Gadre)
 * @version (929)
 */
import java.util.Scanner;
public class Runner
{
    private static int max_count = 1;
    public static void main(){
        System.out.println(); //fixes error with terminal window
        Scanner sc = new Scanner(System.in);
        PersonList pl = new PersonList();
        Person[] p2 = new Person[max_count];
        int count = 0;
        boolean done = false;
        while(!done){
            String nL = sc.nextLine();
            if(nL.equals("quit")){
                done = true;
                System.out.println("program is complete");
            }
            else{
                Person p = new Person(nL);
                if(count >= max_count){
                    p2 = extendArray(p2, 1);
                }
                p2[count++] = p;
            }
        }
        printNames(p2);
    }

    private static Person[] extendArray(Person[] p,int n){
        Person[] np = new Person[p.length + n];
        for(int i = 0; i < p.length; i++){
            np[i] = p[i];
        }
        return np;
    }

    public static void printNames(Person[] persons){
        System.out.println("Total number of persons: " + persons.length);
        for(int i = 0; i < persons.length; i++){
            persons[i].parseArray();
            System.out.println("First Name: " + persons[i].getFirstName());
            System.out.println("Middle Name: " + persons[i].getMiddleName());
            System.out.println("Last Name: " + persons[i].getLastName());
            System.out.println();
        }
    }
}
