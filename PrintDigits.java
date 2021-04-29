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

        if (str.length() < 5) {
            int remainder = 5 - str.length();
            for (int i = 0; i < remainder; i++) {
                output+= "0".charAt(i) + " ";
            }
            for (int i = 0; i < str.length(); i++) {
                output+= str.charAt(i) + " ";
            }
        } else {
            for (int i = 0; i < str.length(); i++) {
                output+= str.charAt(i) + " ";
            }
        }

        
        System.out.println("Length: " + str.length());
        System.out.println(output);
    }


    public static void main(String[] args) {
        printDigits(16384);
        printDigits(2335);
        printDigits(1024);
        printDigits(3);
    }

}