import java.util.Scanner;

public class W26 {

    /*
    * Create a method that gets three
    * @parameters double and
    * @return double smallest
    */
    public static double smallest(double x, double y, double z) {

        double output = 0;

        if (x <= y && x <= z) {
            output = x;
        } else if (y <= x && y <= z) {
            output = y;
        } else if (z <= x && z <= y) {
            output = z;
        }

        return output;

    }

    public static void main(String[] args) {
        
        System.out.println("Please, insert three numbers:");

        Scanner input_one = new Scanner(System.in);
        System.out.print("Number one: ");
        double one = input_one.nextDouble();

        Scanner input_two = new Scanner(System.in);
        System.out.print("Number two: ");
        double two = input_two.nextDouble();

        Scanner input_three = new Scanner(System.in);
        System.out.print("Number three: ");
        double three = input_three.nextDouble();

        System.out.println("The smallest number is: " + smallest(one, two, three));

        input_one.close();
        input_two.close();
        input_three.close();

    }

}