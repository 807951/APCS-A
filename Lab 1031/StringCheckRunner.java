/**
 * gets user input to run string check method
 * @author (Arin Gadre)
 * @version (1102)
 */
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
public class StringCheckRunner
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random ran = new Random();
        StringCheck s = new StringCheck();
        System.out.println("How many Strings would you like to enter? ");
        int numOfStrings = sc.nextInt();
        sc.nextLine();
        int randomInt = ran.nextInt(2);
        String[] userInputArray = new String[numOfStrings];
        ArrayList<String> userInputArrayList = new ArrayList<String>();
        ArrayList<String> resultArrayList = new ArrayList<String>();
        String[] resultArray;
        System.out.print('\u000C');
        if(randomInt == 0){
            //System.out.println("Wordchecker that takes an array and returns an arrayList");
            for(int i = 0; i < numOfStrings; i++){
                System.out.println("Enter string: ");
                userInputArray[i] = sc.nextLine().trim();
            }
        }
        else{
            //System.out.println("Wordchecker that takes an arraylist and returns an array");
            for(int i = 0; i < numOfStrings; i++){
                System.out.println("Enter string: ");
                userInputArrayList.add(sc.nextLine().trim());
            }
        }
        System.out.print('\u000C');
        System.out.println("What keyword would you like to search for? ");
        if(randomInt == 0){
            resultArrayList = s.wordChecker(userInputArray, sc.nextLine().trim());
            System.out.print('\u000C');
            System.out.println(resultArrayList);
        }
        else{
            resultArray = s.wordChecker(userInputArrayList, sc.nextLine().trim());
            System.out.print('\u000C');
            s.printArray(resultArray);
        }
    }
}
