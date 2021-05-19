public class W37 {

    /*
    * Create a method that gets a 
    * @parameter string and 
    * prints only the uppercase letters in the string
    */
    public static void getUppercase(String str) {

        int strLength = str.length();
        
        for (int i = 0; i < strLength; i++) {
            char character = str.charAt(i);
            if (Character.isUpperCase(character)) {
                System.out.print(character);
            }
        }

    }

    public static void main(String[] args) {
        getUppercase("Marco Valeri");
    }

}