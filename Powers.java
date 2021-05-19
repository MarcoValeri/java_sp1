import java.util.Scanner;

public class Powers {

    public static void main(String[] args) {
        printPowers(2);
        printPowers(-1);
        printPowers(10);
        System.out.println("Enter a number: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        printPowers(n);
        scanner.close();
    }

    public static void printPowers(int n) {

        System.out.println("Powes of " + n);

        int result = n * 1;
        System.out.println(n + " to the power 1 = " + result);

        for (int i = 2; i <= 15; i++) {
            result*= n;
            System.out.println(n + " to the power " + i + " = " + result);

        }
        
    }

}