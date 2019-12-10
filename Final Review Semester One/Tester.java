/**
 * Final Review Semester One
 * @author (Arin Gadre)
 * @version (1210)
 */
import java.util.ArrayList;
import java.util.Random;
public class Tester
{
    static ArrayList<Integer> nums = new ArrayList<Integer>();
    public static void main(String[] args){
        /*String str1 = "Jobs, Steven Paul";
        String str2 = "Steven Paul Jobs";
        System.out.println(str1.substring(7));
        System.out.println(str2.substring(str1.indexOf("Paul"),str1.indexOf("Jobs")-2));
        System.out.println(str1.substring(str2.indexOf("Paul"),str2.indexOf("Jobs")-2));
        System.out.println(str1.substring(str1.indexOf("n")+2)); //  correct one

        int[] nums = {1,2,3,4,5}; 
        int sum = 0;
        for(int i = 0; i < nums.length; i++) 
        if(sum < nums[i]) sum+=nums[i];
        System.out.println(sum);
        System.out.println();
        for(int i = 0; i < nums.length; i++)
        if(sum > nums[i]) sum+=nums[i];
        System.out.println(sum);
        System.out.println();
        for(int i = 0; i < nums.length; i++)
        if(sum < nums[i]) sum=nums[i];
        System.out.println(sum);
        System.out.println();
        for(int i = 0; i < nums.length; i++)
        if(sum > nums[i]) sum=nums[i];
        System.out.println(sum);
        System.out.println();
        for(int i = 0; i < nums.length; i++) 
        if(sum == nums[i]) sum = 5;
        System.out.println(sum);
        System.out.println();

        System.out.println(go(3));
        System.out.println();

        for(int i = 2; i > 0 ; i--)
        for(int j = i; j <= 2; j++)
        System.out.println(i + j + ", ");
        System.out.println();

        int m = 0;
        int n = 7;
        while(m < 3) {
        n--;
        m++;
        }
        System.out.println("" + m + n);
        System.out.println();

        int rNum = (int)Math.random()*10 - 2;
        for(int i = 0; i <= 10; i++)
        System.out.print(rNum + ", ");
        System.out.println();
        rNum = rNum = (int)(Math.random()*7) + 2;
        for(int i = 0; i <= 10; i++)
        System.out.print(rNum + ", ");
        System.out.println();
        rNum = (int)(Math.random()*6) + 2;
        for(int i = 0; i <= 10; i++)
        System.out.print(rNum + ", ");
        System.out.println();
        rNum = (int)Math.random()*6 - 2;
        for(int i = 0; i <= 10; i++)
        System.out.print(rNum + ", ");
        System.out.println();

        numberCheck(3, 5);

        String s = "Strings are friends, not food";
        int x = s.indexOf("friends");
        int y = s.indexOf("food");
        String str = s.substring(0, x) + "g" + s.substring(y + 1);
        System.out.println(str);

        toTheMax(4);*/

        Random ran = new Random();
        for(int i = 0; i < 10; i++){
            nums.add(ran.nextInt(9) + 1);
        }
        System.out.println(nums);
        System.out.println();
        adjustMaxMin(nums, 5);
        System.out.println(nums);
    }

    public static void toTheMax(int num) {
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    public static int adjustMaxMin(ArrayList<Integer> levels, int maxLevel){
        int negMaxLevel = maxLevel * -1;
        int counter = 0;
        for(int i = 0;  i < levels.size(); i++){
            if(levels.get(i) > maxLevel){
                levels.set(i, maxLevel);
                counter++;
            }
            else if(levels.get(i) < negMaxLevel){
                levels.set(i, negMaxLevel);
                counter++;
            }
        }
        return counter;
    }

    public static void numberCheck(int minNum, int maxNum){
        int total = 0;
        int k;
        for (k=1; k <= maxNum; k++) {
            if (k >= minNum) {
                total = total + k;
            }
        }
        System.out.println("the total is:" + total);
    }

    public static String go(int x){
        if (x <= 5)
            return "same";
        else if (x >= 3)
            return "notsame";
        return "done";
    }

}