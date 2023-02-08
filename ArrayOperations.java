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
}
