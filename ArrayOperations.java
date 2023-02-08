import java.util.Scanner;
import java.util.Random;

public class ArrayOperations {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rand = new Random();

        int n = in.nextInt();
        int[] array = new int[n];
        for(int i = 0; i < n; i++){
            array[i] = rand.nextInt(0, 101);
        }

        in.close();
    }
    public static int minNumberFinder(int[] theArray){
        int min = Integer.MAX_VALUE;
        for(int n = 0;n < theArray.length;n++){
            if(theArray[n] < min){
                min = theArray[n];
            }
        }
        return min;
    }
    public static int maxNumberFinder(int[] theArray){
        int max = Integer.MIN_VALUE;
        for(int n = 0;n < theArray.length;n++){
            if(theArray[n] > max){
                max = theArray[n];
            }
        }
        return max;
    }
   
}
