
/**
 * practice with nested loops
 *
 * @author (Arin Gadre)
 * @version (918)
 */
public class NestedLoops
{
    public static void main(){
        problemA();
        problemB();
    }
    public static void problemA()
    {
        for(int r = 1; r <= 5; r++){
            for(int c = 0; c < r; c++){
                System.out.print(r);
            }
            System.out.println();
        }
    }
    public static void problemB(){
        for(int i = 0; i < 5; i++){
            for(int j = 5; j < 1; j--){
                for(int c = 0; c < 9; c++){
                    System.out.println(j);
                }
            }
        }
    }
}
