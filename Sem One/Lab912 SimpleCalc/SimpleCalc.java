
/**
 * creates simplecalc methods
 *
 * @author (Arin Gadre)
 * @version (912)
 */
public class SimpleCalc
{
    public double add(int a, int b){
        return (double) a + b;
    }

    public double divide(int a, int b){
        if(b == 0 || a == 0){
            System.out.println("dont use zero!");
            return 0;
        }
        else{
            return (double) a / b;
        }
    }

    public double subtract(int a, int b){
        return (double) a - b;
    }

    public double multiply(int a, int b){
        return (double) a * b;
    }
    
    public int moduloDivide(int a, int b){
        return a % b;
    }
}
