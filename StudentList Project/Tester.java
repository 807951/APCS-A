
/**
 * Write a description of class Tester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Tester
{
    public static double test(double d){
        String gpa = Double.toString(d);
        int decimalIndex = gpa.indexOf(".");
        int diff = gpa.length()-1-decimalIndex;
        double result = 0.0;
        if(d < 0)
            throw new ArithmeticException("Please enter a positive value");         
        else if(decimalIndex == -1)
            throw new ArithmeticException("Please enter a decimal value");
        else if(gpa.length() > 4){
            if(gpa.substring(diff, diff+1).equals("5")
            || gpa.substring(diff, diff+1).equals("6")
            || gpa.substring(diff, diff+1).equals("7")
            || gpa.substring(diff, diff+1).equals("8")
            || gpa.substring(diff, diff+1).equals("9")){
                gpa = Double.toString(d+0.01);
                gpa = gpa.substring(0, diff);
                result = Double.parseDouble(gpa);
            } else
                gpa = gpa.substring(0, diff);
                result = Double.parseDouble(gpa);
        }
        return result;
    }
    public static void main(){
        System.out.println(test(1.2555));
        System.out.println(test(1.2565));
        System.out.println(test(1.2575));
        System.out.println(test(1.2585));
        System.out.println(test(1.2595));
    }
}
