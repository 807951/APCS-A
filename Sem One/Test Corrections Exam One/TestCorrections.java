
/**
 * Exam one test corrections
 * @author (Arin Gadre)
 * @version (10-10-19)
 */
public class TestCorrections
{
    public static void main(String[] args){
        // number #2
        System.out.println(4 % 47 + 10 % 3 + 15 / 4);
        // correct answer: C
        // number #3
        System.out.println((int) (Math.random() * 11) + 10);
        // correct answer: C
        // number #4 
        int num = 0;
        if (num/3 <= 1){
            System.out.print("true");
        }
        System.out.println(" false");
        // correct answer: B
        // number # 9
        for(int i = 0; i < 4; i++){
            for(int j = 0; j <= i; j++){
                System.out.print("X ");
            }
            System.out.println();
        }
        /*
         * output:
         * X
         * X X
         * X X X
         * X X X X
         */
    }
}
