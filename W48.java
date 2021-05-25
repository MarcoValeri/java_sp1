import java.util.Scanner;
import java.util.Arrays;

public class W48 {

    /*
    * Create a method that gets
    * @parameter int[] array a
    * @parameter int[] array b
    * @return boolean true if the array have the 
    * same elements in the same order
    */    
    public static boolean equals(int[] a, int[] b) {

        boolean output = false;

        if (a.length != b.length) {
            return false;
        } else {

            for (int i = 0; i < a.length; i++) {
                if (a[i] != b[i]) {
                    return false;
                } else {
                    output = true;
                }
            }

        }

        return output;

    }
    
    public static void main(String[] args) {
        
        int[] array = new int[10];
        int[] arrayB = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

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

        if (equals(array, arrayB)) {
            System.out.println("These arrays have the same elements in the same order");
        } else {
            System.out.println("These arrays have not the same elements in the smae order");
        }

    }

}
