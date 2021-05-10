import java.util.Scanner;

public class W21 {

    /*
    * Create a method that prompet an integet to the user
    * and 
    * prints if it is negative, zero or positive
    */
    public static void checkInt() {

        System.out.print("Please, insert an integer: ");
        Scanner user_number = new Scanner(System.in);
        int num = user_number.nextInt();

        if (num > 0) {
            System.out.println(num + " is positive");
        } else if (num < 0) {
            System.out.println(num + " is negative");
        } else {
            System.out.println(num + " is equal to zero");
        }

        user_number.close();

    }

    public static void main(String[] args) {
        
        checkInt();

    }

}