import java.util.Scanner;

public class W22 {

    /*
    * Create a method that prompts three integers
    * and prints
    * "all the same" if they are all the same
    * "all different" if they are all different
    * "neither" otherwise
    */
    public static void checkThreeInt() {

        System.out.println("Please, insert three integer");

        Scanner input_first = new Scanner(System.in);
        System.out.print("First integer: ");
        int first = input_first.nextInt();

        Scanner input_second = new Scanner(System.in);
        System.out.print("Second integer: ");
        int second = input_second.nextInt();

        Scanner input_third = new Scanner(System.in);
        System.out.print("Third integer: ");
        int third = input_third.nextInt();

        if (first == second && first == third) {
            System.out.println("All the same");
        } else if (first != second && first != third && second != third) {
            System.out.println("All difference");
        } else {
            System.out.println("Neither");
        }

        input_first.close();
        input_second.close();
        input_third.close();

    }

    public static void main(String[] args) {
        checkThreeInt();
    }

}