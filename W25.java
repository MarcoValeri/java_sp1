import java.util.Scanner;

public class W25 {

    /*
    * Create a method that gets a digit beetween 0 to 3
    * @parameter int positive number and 
    * @return a String as its thousands Roman number
    */
    public static String romanThousands(int thousands) {

        String output = "";

        switch(thousands) {

            case 0:
            output = "";
            break;

            case 1:
            output = "M";
            break;

            case 2:
            output = "MM";
            break;

            case 3:
            output = "MMM";
            break;

            default:
            output = "Error: thoudands should be a number betwwen 0 to 3";
            break;

        }

        return output;

    }

    /*
    * Create a method that gets a digit beetween 0 to 9
    * @parameter int positive number and 
    * @return a String as its hundreds Roman number
    */
    public static String romanHundreds(int hundreds) {

        String output = "";

        switch(hundreds) {

            case 0:
            output = "";
            break;

            case 1:
            output = "C";
            break;

            case 2:
            output = "CC";
            break;

            case 3:
            output = "CCC";
            break;

            case 4:
            output = "CD";
            break;

            case 5:
            output = "D";
            break;

            case 6:
            output = "DC";
            break;

            case 7:
            output = "DCC";
            break;

            case 8:
            output = "DCCC";
            break;

            case 9:
            output = "CM";
            break;

            default:
            output = "Error: hundreds should be a number betwwen 0 to 9";
            break;

        }

        return output;

    }

    /*
    * Create a method that gets a digit beetween 0 to 9
    * @parameter int positive number and 
    * @return a String as its tens Roman number
    */
    public static String romanTens(int tens) {

        String output = "";

        switch(tens) {

            case 0:
            output = "";
            break;

            case 1:
            output = "X";
            break;

            case 2:
            output = "XX";
            break;

            case 3:
            output = "XXX";
            break;

            case 4:
            output = "XL";
            break;

            case 5:
            output = "L";
            break;

            case 6:
            output = "LX";
            break;

            case 7:
            output = "LXX";
            break;

            case 8:
            output = "LXXX";
            break;

            case 9:
            output = "XC";
            break;

            default:
            output = "Error: tens should be a number betwwen 0 to 9";
            break;

        }

        return output;

    }

    /*
    * Create a method that gets a digit beetween 0 to 9
    * @parameter int positive number and 
    * @return a String as its ones Roman number
    */
    public static String romanOnces(int onces) {

        String output = "";

        switch(onces) {

            case 0:
            output = "";
            break;

            case 1:
            output = "I";
            break;

            case 2:
            output = "II";
            break;

            case 3:
            output = "III";
            break;

            case 4:
            output = "IV";
            break;

            case 5:
            output = "V";
            break;

            case 6:
            output = "VI";
            break;

            case 7:
            output = "VII";
            break;

            case 8:
            output = "VIII";
            break;

            case 9:
            output = "IX";
            break;

            default:
            output = "Error: ones should be a number betwwen 1 to 9";
            break;

        }

        return output;

    }

    /*
    * Create a method that converts a positive integer into the
    * Roman number System.
    * @parameter positive integer - only numbers up to 3999
    */
    public static void romanNumber(int num) {

        if (num > 3999 || num <= 0) {
            System.out.println("Numer should be heigher than 0 and less than 3999");
            return;
        }

        int difference = 0;

        int thousands = num / 1000;
        difference = thousands * 1000;
        num-= difference;

        int hundreds = num / 100;
        difference = hundreds * 100;
        num-= difference;

        int tens = num / 10;
        difference = tens * 10;
        num-= difference;

        int ones = num / 1;
        difference = ones * 1;
        num-= difference;

        System.out.print(romanThousands(thousands));
        System.out.print(romanHundreds(hundreds));
        System.out.print(romanTens(tens));
        System.out.print(romanOnces(ones));

    }

    public static void main(String[] args) {
        
        System.out.println("Please, enter a number between 1 to 3999");
        Scanner input_number = new Scanner(System.in);
        int number = input_number.nextInt();
        input_number.close();

        romanNumber(number);

    }

}