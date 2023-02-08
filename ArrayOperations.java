import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class ArrayOperations {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("Input the number of elements in the array: ");
        int n = in.nextInt();
        System.out.println();
        int[] array = new int[n];
        for(int i = 0; i < n; i++){
            array[i] = rand.nextInt(0, 101);
        }
        System.out.println("The array: " + Arrays.toString(array) + "\n");


        boolean keepAsking = true;
        while(keepAsking)
        {
            System.out.println("--------------------------  Options  --------------------------");
            System.out.println("1 - display minimum of the array");
            System.out.println("2 - display maximum of the array");
            System.out.println("3 - display the difference between the average and the elements");
            System.out.println("4 - display the sum of the odd indexed items");
            System.out.println("5 - display the sum of the even indexed items");
            System.out.println("6 - quit");
            System.out.println("---------------------------------------------------------------");
            System.out.print("Input: ");
            int choice = in.nextInt();
            in.nextLine();
            System.out.println();
            if(choice == 1)
            {
                System.out.println("Minimum element in the array is: " + minNumberFinder(array));
            }
            else if(choice == 2)
            {
                System.out.println("Maximum element in the array is: " + maxNumberFinder(array));
            }
            else if(choice == 3)
            {
                System.out.println("The array containing the difference between the element and the average:\n" + displayDiffFromAverage(array));
            }
            else if(choice == 4)
            {
                System.out.println("The sum of elements of odd index: " + oddSum(array));
            }
            else if(choice == 5)
            {
                System.out.println("The sum of elements of even index: " + evenSum(array));
            }
            else if(choice == 6)
            {
                keepAsking = false;
            }
            System.out.println();
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
    public static int oddSum(int[] myArr){
        int sum = 0;
        for(int i = 1; i < myArr.length; i+=2)
        {
            sum += myArr[i];
        }    
        return sum;
    }
    public static int evenSum(int[] myArr){
        int sum = 0;
        for(int i = 0; i < myArr.length; i+=2)
        {
            sum += myArr[i];
        }    
        return sum;
    }
    public static String displayDiffFromAverage(int[] array){
        double sum=0;
        for(int i=0; i<array.length; i++)
        {
            sum+=array[i];
        }
        double average=sum/array.length;
        String differences="";
        for(int i=0; i<array.length; i++)
        {
            if(i==array.length-1)
            {
                differences+=array[i]-average;
            }
            else
            {
                differences+=(array[i]-average)+", ";
            }
        }
        return differences;
    }
   
}

