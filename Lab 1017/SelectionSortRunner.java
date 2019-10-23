/**
 * Runs selection sort algorithm as well as load methods and print methods
 * @author (Arin Gadre)
 * @version (1019)
 */
import java.util.ArrayList;
public class SelectionSortRunner
{
    public static void main(String[] args){
        SelectionSort ss = new SelectionSort();
        int[] ints = new int[1];
        ArrayList<Integer> nums = new ArrayList<Integer>();

        System.out.println(); // fixes indent error with terminal window
        // selection sort with ArrayLists
        ss.loadArray(nums, 10);
        ss.beforeSort(nums);
        //ss.selectionSort(nums);
        ss.afterSort(nums);
        
        // selection sort with arrays
        int[] newInts = ss.loadArray(ints, 10);
        ss.beforeSort(newInts);
        ss.selectionSort(newInts);
        ss.afterSort(newInts);
    }
}
