/**
 * makes sorting methods and load method
 * @author (Arin Gadre)
 * @version (1021)
 */
import java.util.ArrayList;
public class SortTester
{
    private static ArrayList<Integer> numList = new ArrayList<Integer>();
    private static int compares;
    private static int swaps;
    private static double timeElapsed;
    private static int[] arr;
    public static void loadNumbers(ArrayList<Integer> nums, int numOfElements){
        for(int i = 0; i < numOfElements; i++){
            nums.add((int)(Math.random() * 100)+1); 
        }
    }

    public static void loadNumbers(int size){
        arr = new int[size]; 
        for(int i = 0; i < arr.length; i++){
            arr[i] = (int)(Math.random() * 100)+1; 
        }
    }
    
    public static void bubbleSort(ArrayList<Integer> nums){
        timeElapsed = 0;
        double start = System.nanoTime();
        compares = 0; 
        swaps = 0;
        for(int i = nums.size(); i > 0; i--){
            for(int j = 0; j < nums.size()-1; j++){
                if(nums.get(j) > nums.get(j+1)){
                    int n = nums.get(j);
                    nums.set(j, nums.get(j+1));
                    nums.set(j+1, n);
                    compares++;
                    swaps++;
                }
                else{
                    compares++;
                }
            }
        }
        double finish = System.nanoTime();
        timeElapsed = ((finish - start)/1000000);
    }

    public static void selectSort(ArrayList<Integer> arr){
        timeElapsed = 0;
        double start = System.nanoTime();
        compares = 0; 
        swaps = 0;
        for (int i = 0; i < arr.size() - 1; i++) 
        { 
            int minIndex = i; 
            for (int j = i + 1; j < arr.size(); j++){
                if (arr.get(j) < arr.get(minIndex)){
                    minIndex = j; 
                    compares++;
                }
            }
            int n = arr.get(minIndex); 
            arr.set(minIndex, arr.get(i)); 
            arr.set(i, n); 
            swaps++;
        }
        double finish = System.nanoTime();
        timeElapsed = ((finish - start)/1000000000);
    }

    public static void insertSort(ArrayList<Integer> arr){
        timeElapsed = 0;
        double start = System.nanoTime();
        compares = 0; 
        swaps = 0;
        int temp;
        for(int i = 0; i < arr.size(); i ++){
            for(int j = i; j > 0; j--){
                if(arr.get(j) < arr.get(j - 1)){
                    temp = arr.get(j);
                    arr.set(j, arr.get(j - 1));
                    arr.set(j - 1, temp);
                    swaps++;
                    compares++;
                }else{
                    compares++;
                }
            }
        }
        double finish = System.nanoTime();
        timeElapsed = ((finish - start)/1000000000);
    }
    
    public static void printList(ArrayList<Integer> arr){
        System.out.println(arr);
    } 

    public static void printList(int[] a){
        for(int i = 0; i < a.length; i++)
            System.out.print(", " + a[i]);
    } 
    
    public static void mergeSort(int[] a){
        int mid = a.length/2;
        int[] l = new int[mid], r = new int[a.length-mid];
        for(int i = 0; i < mid; i++)
            l[i] = a[i];
        for(int i = mid; i < a.length; i++)
            r[i - mid] = a[i];
        mergeSort(l);
        mergeSort(r);
        merge(a, l, r);
    }
    
    public static void merge(int[] a, int[] l, int[] r){
        int i = 0, j = 0, k = 0;
        while(i < l.length && j < r.length)
            if(l[i] <= r[i])
                a[k++] = l[i++];
            else
                a[k++] = r[j++];
        while(i < l.length)
            a[k++] = l[i++];
        while(j < r.length)
            a[k++] = r[j++];
    }
    
    public static void main(String[] args){
        /*loadNumbers(numList, 10000);
        bubbleSort(numList);
        printList(numList);
        System.out.println("Bubble Sort: Swaps: " + swaps  + ", Compares: " + compares 
            + ", Time Elapsed in milliseconds: " + timeElapsed);
        numList.clear();

        loadNumbers(numList, 10000);
        selectSort(numList);
        printList(numList);
        System.out.println("Select Sort: Swaps: " + swaps  + ", Compares: " + compares 
            + ", Time Elapsed in milliseconds: " + timeElapsed);
        numList.clear();

        loadNumbers(numList, 10000);
        insertSort(numList);
        printList(numList);
        System.out.println("Insert Sort: Swaps: " + swaps  + ", Compares: " + compares 
            + ", Time Elapsed in milliseconds: " + timeElapsed);
        numList.clear();*/
        
        loadNumbers(10);
        printList(arr);
        //mergeSort(arr);
        //printList(arr);
    }
}
