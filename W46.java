import java.util.Scanner;
import java.util.Arrays;

public class W46 {

    /*
    * Create a methot that gets
    * @parameter int[] arr
    * @return boolena tre if the array 
    * contains two adjacent duplicate elements
    */
    public static boolean hadDuplicateNeighbours(int[] array) {

        boolean output = false;

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == array[i + 1]) {
                output = true;
            }
        }

        return output;

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

        if (hadDuplicateNeighbours(array)) {
            System.out.println("This array has two adjacent duplicate elements");
        } else {
            System.out.println("This array has not two adjacent duplicate elements");
        }

    }

}