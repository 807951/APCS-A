/** contains selection sort algorithm, load methods, and print methods
 * @author (Arin Gadre)
 * @version (1019)
 */
import java.util.ArrayList;
public class SelectionSort
{
    public static void loadArray(ArrayList<Integer> nums, int numOfElements){
        for(int i = 0; i < numOfElements; i++){
            nums.add((int)(Math.random() * 100)+1); 
        }
    }

    public static int[] loadArray(int[] nums, int numOfElements){
        nums = new int[numOfElements];
        for(int i = 0; i < numOfElements; i++){
            nums[i] = ((int)(Math.random() * 100)+1);
        }
        return nums;
    }

    public static ArrayList<Integer> selectionSort(ArrayList<Integer> nums){
        for (int i = 0; i < nums.size()-1; i++) 
        { 
            int minIndex = i; 
            for (int j = i+1; j < nums.size(); j++){
                if (nums.get(j) < nums.get(minIndex)){
                    minIndex = j; 
                }
            }
            int n = nums.get(minIndex); 
            nums.set(minIndex, nums.get(i)); 
            nums.set(i, n); 
        } 
        return nums;
    }

    public static void selectionSort(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) 
        { 
            int minIndex = i; 
            for (int j = i + 1; j < arr.length; j++){
                if (arr[j] < arr[minIndex]){
                    minIndex = j; 
                }
            }
            int n = arr[minIndex]; 
            arr[minIndex] = arr[i]; 
            arr[i] = n; 
        } 
    }

    public void beforeSort(int[] nums){
        System.out.print("Before selection sort with arrays: [");
        for(int i = 0; i < nums.length; i++){
            if(i == nums.length-1){
                System.out.print(nums[i] + "]");
            }
            else{
                System.out.print(nums[i] + ", ");  
            }
        }
        System.out.println(); // goes to next line
    }

    public void afterSort(int[] nums){
        System.out.print("After selection sort with arrays: [");
        for(int i = 0; i < nums.length; i++){
            if(i == nums.length-1){
                System.out.print(nums[i] + "]");
            }
            else{
                System.out.print(nums[i] + ", ");  
            }
        }
    }
    public void beforeSort(ArrayList<Integer> nums){
        System.out.println("Before selection sort: " + nums);
    }

    public void afterSort(ArrayList<Integer> nums){
        System.out.println("After selection sort: " + nums);
    }
}
