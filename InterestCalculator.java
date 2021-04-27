public class InterestCalculator {

    // Create a method that calculates the interest rate
    public static double getInterest(double balance, int rate) {
        double interest = balance * rate / 100;
        return interest;
    }

    public static void main(String[] args) {
        double balance = 10000;
        int rate = 5;

        // Initial balance
        System.out.printf("%-30s %10.2f %n", "Initial balance: ", balance);

        // Rate first year
        balance = balance + getInterest(balance, rate);
        System.out.printf("%-30s %10.2f %n", "Balance first year: ", balance);

        // Rate second year
        balance = balance + getInterest(balance, rate);
        System.out.printf("%-30s %10.2f %n", "Balance second year: ", balance);

        // Rate third year
        balance = balance + getInterest(balance, rate);
        System.out.printf("%-30s %10.2f %n", "Balance third year: ", balance);
    }

}