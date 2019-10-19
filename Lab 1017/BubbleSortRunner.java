/**
 * runs bubble sort algorithm with arrays and arraylists
 * @author (Arin Gadre)
 * @version (1018)
 */
import java.util.ArrayList;
public class BubbleSortRunner
{
    public static void main(String[] args){
        BubbleSort bs = new BubbleSort();
        ArrayList<Integer> ints = new ArrayList<Integer>();
        System.out.println();
        System.out.println("After bubble sort with ArrayList: "
            + bs.bubbleSort(ints));  
        int[] nums = new int[1];
        bs.bubbleSort(nums);
    }

}
