public class PrintDigits {

    /*
    * Create a method that receives an
    * @parameter int and breaks it into a 
    * sequence of individual digits
    * The method assume that the input is positive and has no
    * more than five digits
    */
    public static void printDigits(int n) {
        String str = n + "";
        String output = "";

        switch (str.length()) {

            case 0:
            output+= "0 0 0 0 0";
            break;

            case 1:
            output+= "0 0 0 0 " + str.charAt(0);
            break;

            case 2:
            output+= "0 0 0 " + str.charAt(0) + " " + str.charAt(1);
            break;

            case 3:
            output+= "0 0 " + str.charAt(0) + " " + str.charAt(1) + " " + str.charAt(2);
            break;

            case 4:
            output+= "0 " + 
            str.charAt(0) + " " +
            str.charAt(1) + " " +
            str.charAt(2) + " " +
            str.charAt(3) + " ";
            break;

            case 5:
            output+= str.charAt(0) + " " +
            str.charAt(1) + " " +
            str.charAt(2) + " " +
            str.charAt(3) + " " +
            str.charAt(4) + " ";
            break;

            default:
            System.out.println("Error: something is gone wrong");
        }

        System.out.println(output);
    }


    public static void main(String[] args) {
        printDigits(16384);
        printDigits(2335);
        printDigits(1024);
        printDigits(3);
    }

}