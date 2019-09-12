
/**
 * Write a description of class DigitArray here.
 *
 * @author (your name)
 * @version (a version number or a date)
 * public void loadArray() 
 * //loads the digits from num
// into the digits array
// one digit oer array element
public int[] getDigits()

 */
public class DigitArray
{
    private int num;
    private int[] digits;
    private int arrayLength = 0;
    private int index = 0;
    public void loadArray(int a){
        digits = new int[arrayLength++];
        while (a != 0){
            arrayLength++;
            digits = new int[arrayLength];
            digits[index] = a % 10;
            a = a/10;
            index++;
        }
    }
}
