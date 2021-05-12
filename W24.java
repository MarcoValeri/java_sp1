public class W24 {

    public static void main(String[] args) {
        double num_one = 2.0;
        double num_two = 1.98998;

        long one = Math.round(num_one * 100);
        long two = Math.round(num_two * 100);

        if (one == two) {
            System.out.println("They are the same up to two decimal places.");
        } else {
            System.out.println("They are different.");
        }
    }

}