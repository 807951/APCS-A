/**
 * contains reverseList and makeList methods
 * @author (Arin Gadre)
 * @version (1108)
 */
import java.util.ArrayList;
public class Quiz1108
{
    public Quiz1108(){
        int[] x = {1, 2, 3, 4, 5};
        ArrayList<Integer> n1 = makeList(x);
        int[] y = reverseList(n1);
        System.out.println(n1);
        printArray(y);
    }

    public ArrayList<Integer> makeList(int[] nums){ 
        ArrayList<Integer> resultList = new ArrayList<Integer>();
        for(int i = 0; i < nums.length; i++)
            resultList.add(nums[i]);
        return resultList;
    }  

    public int[] reverseList(ArrayList<Integer> nums){ 
        int[] resultArray = new int[nums.size()];
        for(int i = 1; i <= nums.size(); i++)
            resultArray[i - 1] = nums.get(nums.size() - i);
        return resultArray;
    }

    public void printArray(int[] a){
        System.out.print("[");
        for(int i = 0; i < a.length - 1; i++){
            if(i != a.length-1)
                System.out.print(a[i] + ", ");
        }
        System.out.print(a[a.length - 1] + "]"); 
    }

    public static void main(){
        Quiz1108 q = new Quiz1108();
    }
}
