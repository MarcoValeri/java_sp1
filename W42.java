import java.util.Scanner;
import java.util.Arrays;

public class W42 {

    /*
    * Create a method that get a
    * @parameter int[] arr and 
    * @return a new array replacing all even number with 0
    */
    public static int[] replaceEvens(int[] array) {

        for (int i = 0; i < array.length; i++) {

            if (array[i] % 2 == 0) {
                array[i] = 0;
            }

        }

        return array;

    }

    public static void main(String[] args) {
        
        // Prompt for the arr length and its lements
        System.out.print("Please, insert the length of yout array: ");
        Scanner input_array_length = new Scanner(System.in);
        int array_length = input_array_length.nextInt();
        int[] array = new int[array_length];

        System.out.println("Please, insert the elements of your array");
        Scanner input_number = new Scanner(System.in);
        for (int i = 0; i < array_length; i++) {
            System.out.print((i + 1) + " number: ");
            int number = input_number.nextInt();
            array[i] = number;
        }

        input_array_length.close();
        input_number.close();

        System.out.print("Your elements are: ");
        System.out.println(Arrays.toString(array));


        System.out.print("Replace all even number with 0: ");
        System.out.print(Arrays.toString(replaceEvens(array)));
    }

}