import java.util.Scanner;

public class Powers {

    public static void main(String[] args) {
        printPowers(2);
        // printPowers(-1);
        // printPowers(10);
        // System.out.println("Enter a number: ");
        // Scanner scanner = new Scanner(System.in);
        // int n = scanner.nextInt();
        // printPowers(n);
        // scanner.close();
    }

    public static void printPowers(int n) {

        System.out.println("Powes of " + n);

        int result = 0;

        System.out.print(n + " to the power 1 = " + n + "\n");
        for (int k = 2; k <= 15; k++) {
            System.out.print(n + " to the power " + k + " = ");
            result+= n * n;
            System.out.print(result + "\n");
        }

        // int counter = 1;
        // while (counter <= 15) {
        //     int result = 0;
            
        //     for (int k = 1; k <= counter; k++) {
        //         result+= n * n;
        //         System.out.println(n + " to the power " + k + " = " + result);
        //     }

        //     counter++;

        // }
        
    }

}