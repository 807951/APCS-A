/**
 * bubble sort algorithim
 * @author (Arin Gadre)
 * @version (1018)
 */
import java.util.ArrayList;
public class BubbleSort
{
    public static ArrayList<Integer> bubbleSort(ArrayList<Integer> nums){
        loadArray(nums, 10);
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

    public static void loadArray(ArrayList<Integer> nums, int numOfElements){
        for(int i = 0; i < numOfElements; i++){
            nums.add((int)(Math.random() * 100)+1); 
        }
        System.out.println("Before bubble sort with ArrayLists: " + nums);
    }

    public static int[] bubbleSort(int[] nums){
        nums = loadArray(nums, 10);
        System.out.println();
        System.out.print("Before bubble sort with arrays: [");
        for(int i = 0; i < nums.length; i++){
            if(i == nums.length-1){
                System.out.print(nums[i] + "]");
            }
            else{
                System.out.print(nums[i] + ", ");  
            }
        }
        for(int i = nums.length; i > 0; i--){
            for(int j = 0; j < nums.length-1; j++){
                if(nums[j] > nums[j+1]){
                    int n = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = n;
                }
            }
        }
        System.out.println();
        System.out.print("After bubble sort with arrays: [");
        for(int i = 0; i < nums.length; i++){
            if(i == nums.length-1){
                System.out.print(nums[i] + "]");
            }
            else{
                System.out.print(nums[i] + ", ");  
            }
        }
        return nums;
    }

    public static int[] loadArray(int[] nums, int numOfElements){
        nums = new int[numOfElements];
        for(int i = 0; i < numOfElements; i++){
            nums[i] = ((int)(Math.random() * 100)+1);
        }
        return nums;
    }

}
