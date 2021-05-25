import java.util.Scanner;
import java.util.Arrays;

public class W43 {

    /*
    * Create a method shiftRight that receives a
    * @parameter array of integer and
    * @return the same array with all elements shifts by one to 
    * the right
    */
    public static int[] shiftRight(int[] arr) {

        int lastElement = arr[arr.length - 1];
        int[] newArr = new int[arr.length];

        for (int i = 0; i < arr.length - 1; i++) {
            newArr[i + 1] = arr[i];
        }

        newArr[0] = lastElement;

        return newArr;

    }

    public static void main(String[] args) {

        // Create an empty array with a length of 10
        int[] array = new int[5];
        
        // Promp integers to the user
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

        System.out.print("Shifts all elements by one: ");
        System.out.println(Arrays.toString(shiftRight(array)));

    }

}