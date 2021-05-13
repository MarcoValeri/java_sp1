public class W27 {

    /*
    * Create a method that get a
    * @parameter String and
    * @return the middle character if the length of the String is odd
    * or the two middle characters if the length is even
    */
    public static String middle(String str) {

        int strLength = str.length();
        String output = "";

        if (strLength % 2 == 0) {
            output = str.substring(strLength / 2 - 1, strLength / 2 + 1);
        } else {
            output = str.substring((strLength - 1) / 2, (strLength + 1) / 2);
        }

        return output;

    }

    public static void main(String[] args) {
        System.out.println(middle("middle"));
        System.out.println(middle("Marco"));
    }

}