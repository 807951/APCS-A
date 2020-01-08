
/**
 * creates loadArray and getDigits methods
 *
 * @author (Arin Gadre)
 * @version (912)

 */
public class DigitArray
{
    private int num;
    private int[] digits = new int[214748364];
    private int arrayLength = 0;
    private int index = 0;
    public void loadArray(int a){
        while (a != 0){
            arrayLength++;
            digits[index] = a % 10;
            a = a/10;
            index++;
        }
    }
    public void getDigits(){
        for(int i = 0; i < digits.length; i++){
            System.out.println(digits[i]);
        }
    }
}
