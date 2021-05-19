import java.util.Scanner;

public class W36 {

    /*
    * Create a method that gets a
    * @parameter int and computes and 
    * prints out the su of all odd digits
    * For example, if the parameter is 32677
    * then the sum is 3 + 7 + 7 = 17
    */
    public static void sumOddDigits(int num) {

        String number = String.valueOf(num);
        int numberLengh = number.length();
        int sum = 0;
        
        for (int i = 0; i < numberLengh; i++) {
            int current = Integer.parseInt(number.substring(i, i + 1));
            
            if (current % 2 != 0 && i != numberLengh - 1) {
                sum+= current;
                System.out.print(current + " + ");
            } else if (current % 2 != 0 && i == numberLengh - 1) {
                sum+= current;
                System.out.print(current);
            }
        }

        System.out.print(" = " + sum);

    }

    public static void main(String[] args) {
        
        System.out.print("Please, insert an integer: ");
        Scanner input_integer = new Scanner(System.in);
        int input = input_integer.nextInt();
        sumOddDigits(input);
        input_integer.close();

    }

}