import java.util.Scanner;
import java.util.Arrays;

public class W410 {

    /*
    * Create a method that gets 1 parameter
    * @parameter int[] array
    * @return the sum of an array of values, except for the
    * smallest elements
    */
    public static int sumWithoutSmallest(int[] array) {

        int smallest = array[0];
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            if (smallest > array[i]) {
                smallest = array[i];
            }
            sum+= array[i];
        }

        return sum - smallest;

    }

    public static void main(String[] args) {
        
        int[] array = new int[10];

        // Prompt integers to the user
        System.out.println("Please, insert 10 integers");
        Scanner input_number = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter integer number " + (i + 1) + ": ");
            int number = input_number.nextInt();
            array[i] = number;
        }

        input_number.close();

        System.out.print("Your array is: ");
        System.out.println(Arrays.toString(array));

        System.out.print("Sum withput the smallest one: ");
        System.out.println(sumWithoutSmallest(array));

    }

}