import java.util.Scanner;
import java.util.Arrays;

public class W47 {

    /*
    * Create a method that gets 
    * @parameter int[] array 
    * @return the alternating sum of all elements in an array
    */
    public static int alternatingSum(int[] array) {

        int output = 0;

        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                output+= array[i];
            } else {
                output-= array[i];
            }
        }

        return output;

    }

    public static void main(String[] args) {
        
        int[] array = new int[10];

        // Prompt integers to the user
        System.out.println("Please insert 10 integers");
        Scanner input_number = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter integer number " + (i + 1) + ": ");
            int number = input_number.nextInt();
            array[i] = number;
        }

        input_number.close();

        System.out.print("Your array is: ");
        System.out.println(Arrays.toString(array));

        System.out.print("The alternating sum is: ");
        System.out.println(alternatingSum(array));
    }

}