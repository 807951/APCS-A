/**
 * bubble sort algorithim
 * @author (Arin Gadre)
 * @version (1017)
 */
import java.util.ArrayList;
public class Algorithim
{
    public static void main(String[] args){
        ArrayList<Integer> ints = new ArrayList<Integer>();
        System.out.println();
        System.out.println("After bubble sort with ArrayList: "
        + bubbleSortArrayList(ints));
    }
    public static ArrayList<Integer> bubbleSortArrayList(ArrayList<Integer> nums){
        loadArrayList(nums, 10);
        for(int i = nums.size(); i > 0; i--){
            for(int j = 0; j < nums.size()-1; j++){
                if(nums.get(j) > nums.get(j+1)){
                    int n = nums.get(j);
                    nums.set(j, nums.get(j+1));
                    nums.set(j+1, n);
                }
            }
        }
        return nums;
    }
    public static void loadArrayList(ArrayList<Integer> nums, int numOfElements){
        for(int i = 0; i < numOfElements; i++){
            nums.add((int)(Math.random() * 100)+1); 
        }
        System.out.println("Before bubble sort: " + nums);
    }
    /*public static ArrayList<Integer> bubbleSortArray(int[] nums){
        loadArray(nums, 10);
        for(int i = nums.length; i > 0; i--){
            for(int j = 0; j < nums.length-1; j++){
                if(nums.get(j) > nums.get(j+1)){
                    int n = nums.ge[j]);
                    nums.set(j, nums.get(j+1));
                    nums.set(j+1, n);
                }
            }
        }
        return nums;
    }*/
    public static void loadArray(int[] nums, int numOfElements){
        for(int i = 0; i < numOfElements; i++){
            nums[0] = ((int)(Math.random() * 100)+1);
        }
        System.out.println("Before bubble sort: " + nums);
    }
}
