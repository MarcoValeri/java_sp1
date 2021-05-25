import java.util.Arrays;
import java.util.Scanner;

public class W41 {

    /*
    * Create a method that gets an
    * @parameter int[] array and
    * prints the same array swaping the first
    * and the last element
    */
    public static void swapEnds(int[] array) {

        int firstElement = array[0];
        int lastElement = array[array.length - 1];
        array[0] = lastElement;
        array[array.length - 1] = firstElement;

        System.out.println(Arrays.toString(array));

    }

    public static void main(String[] args) {
        
        // Prompt integers
        Scanner input_user = new Scanner(System.in);
        int[] array = new int[7];
        for (int i = 0; i < 7; i++) {
            int input = input_user.nextInt();
            array[i] = input;
        }

        input_user.close();
        
        swapEnds(array);
    }

}