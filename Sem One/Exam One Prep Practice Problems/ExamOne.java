
/**
 * Practice problems for exam one
 *
 * @author (Arin Gadre)
 * @version (917)
 * //indicates problem number 
 */
import java.util.Arrays;
public class ExamOne
{
    public static void main(String[] args){
        // #1
        boolean test = true;
        // #2
        //Pumpkin p = new Pumpkin(3);
        // #4
        int a = 123456;
        int count = 0;
        while(a!= 0){
            a /= 10;
            count++;
        }
        int sum = 0;
        while(a!= 0){
            sum += a%10;
            a /= 10;
        }
        System.out.println("count: " + count + ", sum: " + sum);
        // #5
        sum = 0;
        while(a!= 0){
            sum += a%10;
            a /= 10;
        }
        System.out.println("sum: " + sum);
        // #7
        // #7 output will be that cntrl goes from
        int cntrl= 0, num = 5;
        while(cntrl < num ){
            cntrl++;
            System.out.print("num = " + num + ", cntrl = " + cntrl);
        }
        // #8
        // Far Out will print to the screen
        // #9
        int[] arr = {2,3,5,6,8};
        boolean empty = true;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random()*10)/10;
        }
        // #10
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        // #11
        sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        // #12
        int[] copyArray = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            copyArray[i] = arr[i];
        }
    }
    // #6
    public int multiply(int a, int b){
        return a * b;
    }

    public int divide(int a, int b){
        return a / b;
    }

    public int subtract(int a, int b){
        return a - b;
    }

    public int addition(int a, int b){
        return a + b;
    }
}
