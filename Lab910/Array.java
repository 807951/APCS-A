/**
 * makes array methods
 * @author (Arin Gadre)
 * @version (81919)
 */
import java.util.ArrayList;
import java.util.Collections;
public class Array
{
    private static int maxValue = 100;
    public void loadArray(ArrayList<Integer> ints){
        for(int i = 0; i < ints.size(); i++){
            ints.add((int)(Math.random()*maxValue));
        }
    }

    public void printArray(ArrayList<Integer> ints){
            System.out.print(ints);
    }

    public int getSum(ArrayList<Integer> ints){
        int sum = 0;
        for(int i = 0; i < ints.size(); i++){
            sum += ints.get(i); 
        }
        return sum;
    }

    public int getMean (ArrayList<Integer> ints)
    {
        int sum = 0;
        for(int i = 0; i < ints.size(); i++){
            sum += ints.get(i); 
        }
        return sum/ints.size();
    }

    public double getMedian(ArrayList<Integer> ints)
    {
        Collections.sort(ints, Collections.reverseOrder());
        double median = 0.0;
        if((ints.size() % 2) == 0){
            // array length is even
            median = (ints.get(ints.size()/2) + 
                ints.get((ints.size()/2)-1))/2.0;
        }
        else{
            // array length is odd
            median = ints.get(ints.size()/2);
        }
        return median;
    }

    public int getMode(ArrayList<Integer> ints){
        Collections.sort(ints, Collections.reverseOrder());
        int max_val = ints.get(ints.size()-1);
        int[] count = new int[max_val + 1];
        int mode = 0, max_count = 0;
        for(int i = 0; i < count.length; i++){
            count[i] = 0;
        }
        for(int i = 0; i < ints.size(); i++){
            count[ints.get(i)] = count[ints.get(i)] + 1;
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
