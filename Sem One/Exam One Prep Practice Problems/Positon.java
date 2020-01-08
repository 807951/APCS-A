
/**
 * Write a description of class Positon here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Positon
{
    public Positon(int x, int y)
    {
    }
    public Positon(){}
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public static Positon findPositon(int num, int[][]intArr)
    {
        for(int i = 0;  i < intArr.length; i++){
            for(int j = 0; j < intArr[i].length; j++){
                if(num == intArr[i][j])
                    return new Positon(i, j);
            }
        }
        return null;
    }
    public static Positon[][] getSuccessorArray(int[][] intArr){
        for(int i = )
    }
}
