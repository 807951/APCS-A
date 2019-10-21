/**
 * makes array methods
 * @author (Arin Gadre)
 * @version (81919)
 */
import java.util.*;
public class Array
{
    private static int maxValue = 100;
    public void loadArray(int[] array){
        for(int i = 0; i < array.length; i++){
            array[i] = (int)(Math.random()*maxValue);
        }
    }

    public void printArray(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + ", ");
        }
        System.out.println();
    }

    public int getSum(int[] array){
        int sum = 0;
        for(int i = 0; i < array.length; i++){
            sum += array[i]; 
        }
        return sum;
    }

    public int getMean(int[] array){
        int sum = 0;
        for(int i = 0; i < array.length; i++){
            sum += array[i]; 
        }
        return sum/array.length;
    }

    public double getMedian(int[] array)
    {
        Arrays.sort(array);
        double median = 0.0;
        if((array.length % 2) == 0){
            // array length is even
            median = (array[array.length/2] + 
                array[(array.length/2)-1])/2.0;
        }
        else{
            // array length is odd
            median = array[array.length/2];
        }
        return median;
    }

    public int getMode(int[] arr){
        Arrays.sort(arr);
        int max_val = arr[arr.length-1];
        int[] count = new int[max_val + 1];
        int mode = 0, max_count = 0;
        for(int i = 0; i < count.length; i++){
            count[i] = 0;
        }
        for(int i = 0; i < arr.length; i++){
            count[arr[i]] = count[arr[i]] + 1;
        }
        for(int i = 0; i < count.length; i++){
            if (count[i] > max_count) {
                mode = i;
                max_count = count[i];
            }
        }
        return mode;
    }
}