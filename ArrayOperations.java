import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

/**
 * A class that creates an array of given size with elements randomly chosen between 0 and 100 (both inclusive)
 * and does some cool stuff with them.
 * 
 * @author Can KÜTÜKOĞLU
 * @author Eray İŞÇİ
 * @author Kemal Onur Özkan
 * @author Umut Utku ERŞAHİNCE
 */
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

    /**
     * Given an array of integers, return the minimum.
     * @param theArray the array used
     * @return an integer, the minimum in the given array
     */
    public static int minNumberFinder(int[] theArray){
        int min = Integer.MAX_VALUE;
        for(int n = 0;n < theArray.length;n++){
            if(theArray[n] < min){
                min = theArray[n];
            }
        }
        return min;
    }

    /**
     * Given an array of integers, return the maximum.
     * @param theArray the array used
     * @return an integer, the maximum in the given array
     */
    public static int maxNumberFinder(int[] theArray){
        int max = Integer.MIN_VALUE;
        for(int n = 0;n < theArray.length;n++){
            if(theArray[n] > max){
                max = theArray[n];
            }
        }
        return max;
    }

    /**
     * Given an array of integers, return the sum of elements in the odd indexes.
     * @param myArr the array used
     * @return an integer, the sum of odd-indexed elements
     */
    public static int oddSum(int[] myArr){
        int sum = 0;
        for(int i = 1; i < myArr.length; i+=2)
        {
            sum += myArr[i];
        }    
        return sum;
    }

    /**
     * Given an array of integers, return the sum of elements in the even indexes.
     * @param myArr the array used
     * @return an integer, the sum of even-indexed elements
     */
    public static int evenSum(int[] myArr){
        int sum = 0;
        for(int i = 0; i < myArr.length; i+=2)
        {
            sum += myArr[i];
        }    
        return sum;
    }

    /**
     * Given an array of integers, return the string representation of a new array where new_array[i] = average - array[i]
     * @param array the array used
     * @return a string representing a new array where new_array[i] = average - array[i]
     */
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

    //in case they want this method to return array type
    /*public static double[] displayDiffFromAverage(int[] array){
        double sum=0;
        for(int i=0; i<array.length; i++)
        {
            sum+=array[i];
        }
        double average=sum/array.length;
        double[] result = new double[array.length];
        for(int i = 0; i < result.length; i++)
        {
            result[i] = array[i] - average;
        }

        return result;

    }
    */
}

