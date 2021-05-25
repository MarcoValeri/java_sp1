import java.util.Scanner;
import java.util.Arrays;

public class W44 {

    /*
    * Create a method that gets a
    * @parameter int[] array and
    * @return its second largest element
    */
    public static int secondLargest(int[] array) {

        int output = 0;
        int largest = 0;

        for (int i = 0; i < array.length; i++) {
            if (largest < array[i]) {
                largest = array[i];
            }
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] < largest && output < array[i]) {
                output = array[i];
            }
        }

        return output;

    } 

    public static void main(String[] args) {

        int[] array = new int[10];
        
        // Prompt integers
        System.out.println("Please, insert ten integers");
        Scanner input_number = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter integer number " + (i + 1) + ": ");
            int number = input_number.nextInt();
            array[i] = number;
        }

        input_number.close();

        System.out.print("Your array is: ");
        System.out.println(Arrays.toString(array));

        System.out.print("The second largest number is: ");
        System.out.println(secondLargest(array));

    }

}