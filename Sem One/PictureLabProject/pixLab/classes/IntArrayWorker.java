import java.util.Random;
public class IntArrayWorker
{
    /** two dimensional matrix */
    private int[][] matrix = null;

    /**
     * loadEvensOdds will load the left side of the array with even numbers and odds on the right side
     * flipVertical will take the array and mirror elements over a centerline.  The result should be Odds on the left and evens on the right.
     */
    public void loadEvensOdds(int[][] a){
        Random ran = new Random();
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[i].length; j++){
                a[i][j] = ran.nextInt(10) + 1;
                if(j <= (a[i].length / 2) - 1){
                    if((a[i][j] % 2) != 0){
                        int n = ran.nextInt(1);
                        if(n == 1)
                            a[i][j] += 1;
                        else
                            a[i][j] -= 1;
                    }
                }
                else{
                    if((a[i][j] % 2) == 0){
                        int n = ran.nextInt(1);
                        if(n == 1)
                            a[i][j] += 1;
                        else
                            a[i][j] -= 1;
                    }
                }
            }
        }
    }

    public static void printArrays(int[][] a){
        for(int i = 0; i < a.length; i++){
            System.out.print("[");
            for(int j = 0; j < a[i].length; j++){
                if(j != a[i].length-1)
                    System.out.print(a[i][j] + ", ");
                else
                    System.out.print(a[i][j] + "]");
            }
            System.out.println();
        }
    }

    public void flipVertical(int[][] a){
        int temp = 0;
        for(int i = 0; i < (a.length); i++){
            for(int j = 0; j < a[i].length/2; j++){
                temp = a[i][j];
                a[i][j] = a[i][a[i].length-j-1];
                a[i][a[i].length-j-1] = temp;
            }
        }
    }

    /** set th  e matrix to the passed one
     * @param theMatrix the one to use
     */
    public void setMatrix(int[][] theMatrix)
    {
        matrix = theMatrix;
    }

    /**
     * Method to return the total 
     * @return the total of the values in the array
     */
    public int getTotal()
    {
        int total = 0;
        for (int row = 0; row < matrix.length; row++)
        {
            for (int col = 0; col < matrix[0].length; col++)
            {
                total = total + matrix[row][col];
            }
        }
        return total;
    }

    /**
     * Method to return the total using a nested for-each loop
     * @return the total of the values in the array
     */
    public int getTotalNested()
    {
        int total = 0;
        for (int[] rowArray : matrix)
        {
            for (int item : rowArray)
            {
                total = total + item;
            }
        }
        return total;
    }

    /**
     * Method to fill with an increasing count
     */
    public void fillCount()
    {
        int numCols = matrix[0].length;
        int count = 1;
        for (int row = 0; row < matrix.length; row++)
        {
            for (int col = 0; col < numCols; col++)
            {
                matrix[row][col] = count;
                count++;
            }
        }
    }

    /**
     * print the values in the array in rows and columns
     */
    public void print()
    {
        for (int row = 0; row < matrix.length; row++)
        {
            for (int col = 0; col < matrix[0].length; col++)
            {
                System.out.print( matrix[row][col] + " " );
            }
            System.out.println();
        }
        System.out.println();
    }

    public int getLargest()
    {
        int max = matrix[0][0];
        for (int row = 0; row < matrix.length; row++){
            for (int col = 0; col < matrix[0].length; col++){
                if (matrix[row][col] > max)
                    max = matrix[row][col];
            }
        }
        return max;
    }

    public int getCount(int num)
    {
        int count = 0;
        for (int row = 0; row < matrix.length; row++){
            for (int col = 0; col < matrix[0].length; col++){
                if (matrix[row][col] == num)
                    count++;      
            }
        }
        return count;
    }

    /** 
     * fill the array with a pattern
     */
    public void fillPattern1()
    {
        for (int row = 0; row < matrix.length; row++)
        {
            for (int col = 0; col < matrix[0].length; 
            col++)
            {
                if (row < col)
                    matrix[row][col] = 1;
                else if (row == col)
                    matrix[row][col] = 2;
                else
                    matrix[row][col] = 3;
            }
        }
    }

    public int getColTotal(int col)
    {
        int total = 0;
        if (col < 0)
            return total;
        for (int row = 0; row < matrix.length; row++)
        {
            if (col < matrix[row].length)
                total += matrix[row][col];

        }
        return total;
    }
}