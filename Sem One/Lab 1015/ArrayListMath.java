/**
 * makes methods using ArrayLists
 * @author (Arin Gadre)
 * @version (81919)
 */
import java.util.Collections;
import java.util.ArrayList;
public class ArrayListMath
{
    public void loadArray(ArrayList<Integer> nums, int numOfElements){
        for(int i = 0; i < numOfElements; i++){
            nums.add((int)(Math.random() * 100));
        }
    }

    public void printArray(ArrayList<Integer> nums){
        System.out.println(nums);
    }

    public int getSum(ArrayList<Integer> nums){
        int sum = 0;
        for(int i = 0; i < nums.size(); i++){
            sum += nums.get(i); 
        }
        return sum;
    }

    public double getMean(ArrayList<Integer> nums){
        int sum = 0;;
        for(Integer num : nums){
            sum += num; 
        }
        return (double)sum/(nums.size());
    }

    public double getMedian(ArrayList<Integer> nums)
    {
        Collections.sort(nums);
        System.out.println(nums);
        double median = 0.0;
        if((nums.size() % 2) == 0){
            // array length is even
            median = (double)(nums.get(nums.size()/2)) + 
            nums.get((nums.size()/2)-1)/2;
        }
        else{
            // array length is odd
            median = nums.get(nums.size()/2);
        }
        return median;
    }

    public boolean testArrayListForDiff(ArrayList<Integer> nums){
        boolean testSim = false;
        for(int i = 1; i < nums.size(); i++){
            if(nums.get(i - 1) != nums.get(i)){
                testSim = false;
            }
            else if(nums.get(i - 1) == nums.get(i)){
                return true;
            }
        }
        return testSim;
    }

    public int getMode(ArrayList<Integer> nums){
        Collections.sort(nums);
        int max_val = nums.get(nums.size()-1);
        int[] count = new int[max_val + 1];
        int mode = 0, max_count = 0;
        //if there is no mode, then it returns 0
        if(testArrayListForDiff(nums) == true){
            for(int i = 0; i < nums.size(); i ++){

            }
            for(int i = 0; i < count.length; i++){
                count[i] = 0;
            }
            for(int i = 0; i < nums.size(); i++){
                count[nums.get(i)] += 1;
            }
            for(int i = 0; i < count.length; i++){
                if (count[i] > max_count) {
                    mode = i;
                }
            }
            return mode;
        }
        else{
            return 0;
        }
    }
}