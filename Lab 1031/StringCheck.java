/**
 * makes 2 word checker methods and runs them by asking for user input
 * @author (Arin Gadre)
 * @version (1102)
 */
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
public class StringCheck
{
    public static ArrayList<String> wordChecker(String[] wordList, String key){
        String[] split;
        ArrayList<String> words = new ArrayList<String>();
        int n =  wordList.length;
        key = key.trim();
        for(int i = 0; i < n; i++){
            split = wordList[i].split(" ");
            int x = split.length;
            for(int j = 0; j < x; j++){
                if(split[j].equals(key)){
                    words.add(wordList[i]);
                }
            }
        }
        return words;
    }
    public static String[] wordChecker(ArrayList<String> wordList, String key){
        String[] split;
        ArrayList<Integer> nums = new ArrayList<Integer>(); 
        int n =  wordList.size();
        key = key.trim();
        for(int i = 0; i < n; i++){
            split = wordList.get(i).split(" ");
            int x = split.length;
            for(int j = 0; j < x; j++){
                if(split[j].equals(key)){
                    nums.add(i);
                }
            }
        }
        String[] result = new String[nums.size()];
        for(int y = 0; y < nums.size(); y++){
            result[y] = wordList.get(nums.get(y));
        }
        return result;
    }
    public static void printArray(String[] str){
        for(int i = 0;i < str.length; i++){
            System.out.println(str[i]);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); // creates Scanner object
        Random ran = new Random(); 
        /* I didn't know how to decide which method to use
         * so I left it up to chance */
        System.out.println("How many Strings would you like to enter? "); // asks user for how many strings they want to input
        int numOfStrings = sc.nextInt(); // used to set the size of the array thats contains user inputs
        // also used to fix how many times the for loops will run
        sc.nextLine(); // fixes line error with scanner
        int randomInt = ran.nextInt(2); // returns 0 or 1 
        String[] userInputArray = new String[numOfStrings]; // array of user input strings which will be passed into wordchecker
        ArrayList<String> userInputArrayList = new ArrayList<String>(); // arraylist of user input strings which will be passed into wordchecker
        ArrayList<String> resultArrayList = new ArrayList<String>(); // result of word checker
        String[] resultArray; // result of wordchecker
        System.out.print('\u000C'); // clears terminal screen
        if(randomInt == 0){
            for(int i = 0; i < numOfStrings; i++){
                System.out.println("Enter string: "); // asks user for a string 
                userInputArray[i] = sc.nextLine().trim(); // adds string to the string array
            }
        }
        else{
            //System.out.println("Wordchecker that takes an arraylist and returns an array");
            for(int i = 0; i < numOfStrings; i++){
                System.out.println("Enter string: "); // asks user for a string
                userInputArrayList.add(sc.nextLine().trim()); // adds string to the array list
            }
        }
        System.out.print('\u000C'); // clears terminal screen
        System.out.println("What keyword would you like to search for? "); // asks user for a keyword
        if(randomInt == 0){
            resultArrayList = wordChecker(userInputArray, sc.nextLine().trim()); // returns string in which the key exists
            System.out.print('\u000C'); // clears terminal screen
            System.out.println(resultArrayList); // prints the string in which the variable key exists 
        }
        else{
            resultArray = wordChecker(userInputArrayList, sc.nextLine().trim()); // returns string in which they key exists
            System.out.print('\u000C'); // clears terminal screen
            printArray(resultArray); // prints the string in which the variable key exists 
        }
    }
}
