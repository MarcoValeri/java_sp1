import java.util.Scanner;

public class InterestCalculatorWithTarget
{
    public static void main(String[] args)
    {
        System.out.println("Please enter a savings target:");
        Scanner scan = new Scanner(System.in);
        double savingsTarget = scan.nextDouble();

        double balance = 10000;
        System.out.println("The initial balance is " + balance);
        int rate = 5;
        
        balance = withInterestOn(balance, rate);
        System.out.println("Balance after 1 Year is " + balance);
        if (balance >= savingsTarget)
        {
            System.out.println("Congratulations, your " +
                "savings target has been reached.");
            return;
        }
        
        balance = withInterestOn(balance, rate);
        System.out.println("Balance after 2 Years is " + balance);
        if (balance >= savingsTarget)
        {
            System.out.println("Congratulations, your " +
                "savings target has been reached.");
            return;
        }
        
        balance = withInterestOn(balance, rate);
        System.out.println("Balance after 3 Years is " + balance);
        if (balance >= savingsTarget)
        {
            System.out.println("Congratulations, your " +
                "savings target has been reached.");
            return;
        }
    }

    public static double withInterestOn(double balance, int rate)
    {
        double interest = balance * rate / 100;
        return balance + interest;
    }
}