public class W29 {

    /*
    * Create a method that get a 
    * @parameter int as year and 
    * @ return true if it is a leap year
    * otherwise is false
    */
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 || year % 400 == 0) && (year % 100 != 0) ? true : false;
    }
    
    public static void main(String[] args) {
        int year = 1900;

        if (isLeapYear(year)) {
            System.out.println("It's a leap year");
        } else {
            System.out.println("It's not a leap year");
        }
    }

}
