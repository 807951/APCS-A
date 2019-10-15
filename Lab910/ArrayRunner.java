
/**
 * Uses methods from Array class
 *
 * @author (Arin Gadre)
 * @version (81919)
 */
import java.util.*;
public class ArrayRunner
{
    public static void main(){
        Array a1 = new Array();
        //int[] nums = new int[100];
        a1.loadArray(nums);
        a1.printArray(nums);
        System.out.println("Sum is: " + a1.getSum(nums));
        System.out.println("Mean is: " + a1.getMean(nums));
        System.out.println("Median is: " + a1.getMedian(nums));
        System.out.println("Mode is: " + a1.getMode(nums));

    }
}
