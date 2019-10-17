/**
 * bubble sort algorithim
 * @author (Arin Gadre)
 * @version (1017)
 */
import java.util.ArrayList;
public class Algorithim
{
    private static ArrayList<Integer> nums = new ArrayList<Integer>();
    public static void main(String[] args){
        loadArray(nums, 10);
        System.out.println(nums);
        for(int i = nums.size(); i > 0; i--){
            for(int j = 0; j < nums.size()-1; j++){
                if(nums.get(j) > nums.get(j+1)){
                    int n = nums.get(j);
                    nums.set(j, nums.get(j+1));
                    nums.set(j+1, n);
                }
            }
        }
        System.out.println(nums);
    }

    public static void loadArray(ArrayList<Integer> nums, int numOfElements){
        for(int i = 0; i < numOfElements; i++){
            nums.add((int)(Math.random() * 100)+1);
        }
    }
}
