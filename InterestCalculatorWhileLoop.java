import java.util.Scanner;

public class InterestCalculatorWhileLoop {

    public static void main(String[] args) {
        
        System.out.println("Computes you balance with a rate of 5% until the initil balance is double the initial balance");
        System.out.print("Please, insert your initial balance: ");

        Scanner input_balance = new Scanner(System.in);
        double balance = input_balance.nextDouble();
        
        double balance_goal = balance * 2;
        double interest = 0;
        int year = 1;
        int rate = 5;
        
        while (balance <= balance_goal) {
            interest = balance * rate / 10;
            balance+= interest;
            System.out.print("Balance after " + year + " ");
            System.out.print(year == 1 ? "year: " : "years: ");
            System.out.print("£" + balance + "\n");
            year++;
        }

        input_balance.close();

    }

}
