import java.util.Scanner;
import java.util.Arrays;

public class W45 {

    /*
    * Create a method that gets 
    * @parameter int[] array and
    * @return boolean true if the array's elements
    * are sorted in increasing order
    */
    public static boolean isSorted(int[] array) {

        boolean output = false;

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                return false;
            } else {
                output = true;
            }
        }

        return output;

    }

    public static void main(String[] args) {
        
        int[] array = new int[10];

        // Prompet integers to the user
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

        if (isSorted(array)) {
            System.out.println("This array is sorted in increasing order");
        } else {
            System.out.println("This array is not sorted in increasing order");
        }

    }

}