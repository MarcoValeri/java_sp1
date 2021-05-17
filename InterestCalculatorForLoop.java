import java.util.Scanner;

public class InterestCalculatorForLoop {
    
    public static void main(String[] args) {

        System.out.print("Please, insert your initial balance: ");
        Scanner input_initial_balance = new Scanner(System.in);
        double balance = input_initial_balance.nextDouble();

        int year = 1;
        int rate = 5;
        double interest = 0;
        System.out.printf("%10s %10s %10s \n", "Year", "Interest", "Balance");
        while (year <= 10) {
            interest = balance * rate / 10;
            balance+= interest;
            System.out.printf("%10s %10.2f %10.2f \n", year, interest, balance);
            year++;
        }

        input_initial_balance.close();

    }

}
