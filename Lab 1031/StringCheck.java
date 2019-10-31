/**
 * makes 2 word checker methods
 * @author (Arin Gadre)
 * @version (1031)
 */
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
        ArrayList<String> str1 = new ArrayList<String>();
        str1.add("obama prism");
        str1.add("bruh momento numero dos");
        str1.add("joe mama");
        String[] str2 = {"obama prism", "bruh momento numero dos", "joe mama"};
        String key = "dos";
        ArrayList<String> result1 = wordChecker(str2, key);
        System.out.println(result1);
        String[] result2 = wordChecker(str1, key);
        printArray(result2);
    }
}
