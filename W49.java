import java.util.Scanner;
import java.util.Arrays;

public class W49 {

    /*
    * Create a mehod that gets 
    * @parameter int[] array
    * @return true if the array contains duplicate elements
    * which need not be adjacent
    */ 
    public static boolean hasDuplicates(int[] array) {

        boolean output = false;

        for (int x = 0; x < array.length; x++) {
            for (int y = 0; y < array.length; y++) {
                if (x != y && array[x] == array[y]) {
                    output = true;
                }
            }
        }

        return output;

    }

    public static void main(String[] args) {
        
        int[] a = new int[10];

        // Prompt 10 integers to the user
        System.out.println("Please, insert the elements of the first array");
        Scanner input_numbers = new Scanner(System.in);

        for (int i = 0; i < a.length; i++) {
            System.out.print("Enter integer number " + (i + 1) + ": ");
            int number = input_numbers.nextInt();
            a[i] = number;
        }

        input_numbers.close();

        System.out.print("Array a: ");
        System.out.println(Arrays.toString(a));

        if (hasDuplicates(a)) {
            System.out.println("Array 'a' contains duplicate elements");
        } else {
            System.out.println("Array 'a' does not contain duplicate elements");
        }

    }

}