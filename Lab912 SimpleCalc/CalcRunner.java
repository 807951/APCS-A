
/**
 * Write a description of class CalcRunner here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CalcRunner
{
    public static void main(String[] args){
        SimpleCalc sc1 = new SimpleCalc();
        System.out.println("Add method: " + sc1.add(3,4));
        System.out.println("Division method: " + sc1.divide(3,4));
        System.out.println("Multiply method: " + sc1.multiply(3,4));
        System.out.println("Subtract method: " + sc1.subtract(3,4));
        System.out.println("Mod method: " + sc1.moduloDivide(8,4));
    }
}
