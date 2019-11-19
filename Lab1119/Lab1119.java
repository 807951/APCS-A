import java.util.*;
public class Lab1119
{
    private static int[][] nums = new int[10][10];
    public Lab1119(){
        loadArray();
        printArrays();
        System.out.println();
        getMean();
        System.out.println();
        getTotalMean();
        System.out.println();
        getMedian();
        System.out.println();
        getMode();
    }

    public static void main(){
        Lab1119 l = new Lab1119();
    }

    public void loadArray(){
        Random ran = new Random();
        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < nums[i].length; j++){
                nums[i][j] = ran.nextInt(10) + 1;
            }
        }
    }

    public void printArrays(){
        for(int i = 0; i < nums.length; i++){
            System.out.print("[");
            for(int j = 0; j < nums[i].length; j++){
                if(j != nums[i].length-1)
                    System.out.print(nums[i][j] + ", ");
                else
                    System.out.print(nums[i][j] + "]");
            }
            System.out.println();
        }
    }

    public void getMean(){
        double sum;
        for(int i = 0; i < nums.length; i++){
            sum = 0.0;
            for(int j = 0; j < nums[i].length; j++){
                sum += (double)nums[i][j];
            }
            System.out.println("Mean for line " + (i+1) + ":  "  + (sum/nums[i].length));
        }
    }

    public void getTotalMean(){
        double sum = 0.0;
        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < nums[i].length; j++){
                sum += (double)nums[i][j];
            }
        }
        System.out.println("Total mean:  " + sum/100.0);
    }

    public void getMedian()
    {
        double median = 0.0;
        for(int i = 0;  i < nums.length; i++){
            Arrays.sort(nums[i]);
            if((nums[i].length % 2) == 0){
                // array length is even
                median = (nums[i][nums[i].length/2] + 
                    nums[i][(nums[i].length/2)-1])/2.0;
            }
            else{
                // array length is odd
                median = nums[i][nums[i].length/2];
            }
            System.out.println("Median for line " + (i+1) + ":  " + median);
        }
    }

    public void getMode(){
        int modeCounter;
        for(int i = 0;  i < nums.length; i++){
            Arrays.sort(nums[i]);
            int max_val = nums[i][nums[i].length-1];
            int[] count = new int[max_val + 1];
            int mode = 0, max_count = 0;
            for(int j = 0; j < count.length; j++){
                count[j] = 0;
            }
            for(int j = 0; j < nums[i].length; j++){
                count[nums[i][j]] = count[nums[i][j]] + 1;
            }
            for(int j = 0; j < count.length; j++){
                if (count[j] > max_count) {
                    mode = j;
                    max_count = count[j];
                }
            }
            System.out.println("Mode for line " + (i + 1) +":  " + mode);
        }
    }
}

