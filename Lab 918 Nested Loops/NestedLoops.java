/**
 * practice with nested loops
 *
 * @author (Arin Gadre)
 * @version (918)
 */
import static java.lang.System.out;
public class NestedLoops
{
    public static void main(String[] args){
        problemA();
        problemB();
        problemC(2);
        problemD(7);
        problemE();
        problemF();
        problemG();
    }

    public static void problemA()
    {
        out.println(); //fixes indent error with terminal window
        for(int i = 1; i < 6; i++){
            for(int j = 0; j < i; j++){
                out.print(i);
            }
            out.println();
        }
    }

    public static void problemB(){
        out.println(); //fixes indent error with terminal window
        for(int i = 5; i > 1; i--){
            for(int j = 1; j < 9; j++) {
                System.out.print(i);
            }
            out.println();
        }
    }

    public static void problemC(int num){
        out.println(); //fixes indent error with terminal window
        for(int i = 0; i < num; i++){
            for(int j = 0; j < num; j++){
                out.print(num + " ");
            }
            out.println();
        }
    }

    public static void problemD(int n){
        out.println(); //fixes indent error with terminal window
        int lineNum = 1;
        for(int i = 0; i < n; i++){
            for(int j = n; j >= lineNum ; j--){
                out.print("-");
            }
            out.print(i+1);
            out.println();
            lineNum++;
        }
    }

    public static void problemE(){
        out.println(); //fixes indent error with terminal window
        int lineNum = 1;
        int asteriskNum = 1;
        int spaceNum = 7;
        for(int i = 0; i < 7; i++){
            for(int j = 0; j < spaceNum; j++){
                out.print(" ");
            }
            for(int x = 0; x < asteriskNum; x++){
                out.print("*");
            }
            lineNum++;
            asteriskNum++;
            spaceNum--;
            out.println();
        }
    }

    public static void problemF(){
        out.println(); //fixes indent error with terminal window
        int size = 13;
        for (int i = 1; i <= size-1; i += 2) {
            for (int k = size; k >= i; k -= 2) {
                out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                out.print("*");
            }
            out.println();
        }
        for (int i = 1; i <= size; i += 2) {
            for (int k = 1; k <= i; k += 2) {
                out.print(" ");
            }
            for (int j = size; j >= i; j--) {
                out.print("*");
            }
            out.println();
        }
    }

    public static void makeBorder(){
        out.println("+ - - - - - - - - - - +");
    }

    public static void problemG(){
        System.out.println(); //fixes indent error with terminal window
        makeBorder();
        topDiamond();
        bottomDiamond();
        makeBorder();
        bottomDiamond();
        topDiamond();
        makeBorder();
    }

    public static void topDiamond(){
        int lineNum = -5;
        int numOfSlashes = 0;
        for(int i = 0; i < 8; i+=2){
            out.print("|");
            for(int j = 5; j > lineNum; j--){
                out.print(" ");
            }
            for(int x = 0; x < numOfSlashes; x++){
                out.print("/");
            }
            System.out.print("+");
            for(int x = 0; x < numOfSlashes; x++){
                out.print("\\");
            }
            for(int j = 5; j > lineNum ; j--){
                out.print(" ");
            }
            out.print("|");
            numOfSlashes++;
            out.println();
            lineNum++;
        }
    }

    public static void bottomDiamond(){
        int lineNum = 7;
        int numOfSlashes = 3;
        for(int i = 0; i < 8; i+=2){
            out.print("|");
            for(int j = 0; j < lineNum; j++){
                out.print(" ");
            }
            for(int x = 0; x < numOfSlashes; x++){
                out.print("\\");
            }
            System.out.print("+");
            for(int x = 0; x < numOfSlashes; x++){
                out.print("/");
            }
            for(int j = 0; j < lineNum; j++){
                out.print(" ");
            }
            out.print("|");
            numOfSlashes--;
            out.println();
            lineNum++;
        }
    }
}