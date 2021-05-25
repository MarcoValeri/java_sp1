import java.util.Arrays;
import java.util.Scanner;

public class ArrayExercises {

    public static void main(String[] args) {
        
        // Declare an array of integers
        // and allocate memory for 5 elements
        int[] array = new int[5];

        Scanner scanner = new Scanner(System.in);

        // note that array.length is used in the condition
        // this will work for an array of any lenght, not just 5
        for (int i =0; i < array.length; i++) {
            // indexes range from 0 to raay.length - 1
            System.out.print("Enter integer number " + (i +1) + ": ");
            // read an integer and store in it the array at index i 
            array[i] = scanner.nextInt();
        }

        // Prints the sum of the elements of the array
        System.out.println("The sum of your integer is: " + sum(array));

        // Prints repeat method
        printArray("Repeat three times your integers: ", repeat(array));
    }

    /*
    * A helper method that take 2 parameters 
    *       a message (a String)
    *       and an array of integers
    * and  outputs the message and he array's contents to
    * the terminale
    */
    public static void printArray(String message, int[] array) {
        System.out.println(message + " " + Arrays.toString(array));
    }

    /*
    * Create a method that gets an
    * @parameter int[] array and 
    * @return the sum of the elements of the array
    */ 
    public static int sum(int[] a) {

        int sum = 0;

        for (int i = 0; i < a.length; i++) {
            sum+= a[i];
        }

        return sum;

    }

    /*
    * Create a method that gets
    * @parameter int[] and 
    * @return a new array with three times elements of orginal array
    */ 
    public static int[] repeat(int[] arr) {

        int newLength = arr.length * 3;
        int[] newArr = new int[newLength];
        int count = 0;

        for (int i = 0; i < newLength; i++) {
            
            if (count < arr.length) {
                newArr[i] = arr[count];
                count++;
            } else {
                count = 0;
                newArr[i] = arr[count];
                count++;
            }

        }

        return newArr;

    }

}