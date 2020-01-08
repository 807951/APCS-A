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
        ArrayList<Integer> a1 = new ArrayList<Integer>();
        ArrayListMath alm = new ArrayListMath();
        alm.loadArray(a1, 3);
        alm.printArray(a1);
        System.out.println("Sum is: " + alm.getSum(a1));
        System.out.println("Mean is: " + alm.getMean(a1));
        System.out.println("Median is: " + alm.getMedian(a1));
        System.out.println("Mode is: " + alm.getMode(a1));
    }
}