/**
 * practicing 2d array syntax
 * @author (Arin Gadre)
 * @version (1115)

Create a class name GridTester with the following methods:
numberOfGreatest will return the number of times the greatest number exists n the array.
findAvg will return the average of all of the numbers in the list

 */
import java.util.Random;
public class GridTester
{
    private int[][] nums;
    public void loadArray(){
        nums = new int[10][10];
        Random ran = new Random();
        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < nums[i].length; j++){
                nums[i][j] = (int)(101 * Math.random());
            }
        }
    }

    public int sumAll(){
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < nums[i].length; j++){
                sum += nums[i][j];
            }
        }
        return sum;
    }

    public int findGreatest(){
        int max = 0;
        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < nums[i].length; j++){
                if(nums[i][j] > max)
                    max = nums[i][j];
            }
        }
        return max;
    }

    public int numberOfGreatest(int n){
        int maxCounter = 0;
        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < nums[i].length; j++){
                if(nums[i][j] == n)
                    maxCounter++;
            }
        }
        return maxCounter;
    }

    public double findAvg(){
        int numOfElements = 0;
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < nums[i].length; j++){
                numOfElements++;
                sum += nums[i][j];
            }
        }
        return (double)(sum/numOfElements);
    }

    public GridTester(){
        loadArray();
        int sum = sumAll();
        System.out.println("sum of all elements:  " + sum);
        int max = findGreatest();
        System.out.println("Biggest number:  " + max);
        int numOfMax = numberOfGreatest(max);
        System.out.println("Number of times " + max + " appears:  " + numOfMax);
        double avg = findAvg();
        System.out.println("Avg of all element in the array:  " + avg);
    }
    public static void main(String[] args){
        GridTester gd = new GridTester();
    }
}
