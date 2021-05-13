public class W28 {

    /*
    * Create a method that test whether a year is a leap year
    */
    public static boolean isLeapYear(int year) {

        boolean output = true;

        if (year % 4 == 0 || year % 400 == 0) {

            if (year % 100 == 0) {
                output = false;
            } else {
                output = true;
            }

        }

        return output;

    }

    public static void main(String[] args) {
        int year = 1984;

        if (isLeapYear(year)) {
            System.out.println("It's a leap year");
        } else {
            System.out.println("It is not a leap year");
        }
    }

}