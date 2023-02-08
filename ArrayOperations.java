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
        boolean keepAsking = true;
        while(keepAsking)
        {
            System.out.println("Press 1 if you want to find the minimum of the array");
            System.out.println("Press 2 if you want to find the maximum of the array");
            System.out.println("Press 3 if you want to display the difference of the average and each of the elements in the array");
            System.out.println("Press 4 if you want to find the sum of odd indexed and the even indexed numbers");
            System.out.println("Press 5 if you want to quit");
            int choice = in.nextInt();
            in.nextLine();
            if(choice == 1)
            {
                System.out.println(minNumberFinder(array));
            }
            else if(choice == 2)
            {
                System.out.println(maxNumberFinder(array));
            }
            else if(choice == 3)
            {
                //method gelcek buraya System.outprintln()
            }
            else if(choice == 4)
            {
                //aynı şekilde
            }
            else
            {
                keepAsking = false;
            }
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

