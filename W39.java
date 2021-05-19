import java.util.Scanner;

public class W39 {

    /*
    * Create a method that gets a 
    * @parameter string and 
    * @return this string in reverse order
    */
    public static String reverseString(String str) {

        int strLength = str.length();
        String output = "";

        for (int i = strLength - 1; i >= 0; i--) {
            output+= str.charAt(i);
        }

        return output;

    }

    public static void main(String[] args) {
        
        System.out.print("Please, insert a word: ");
        Scanner input_word = new Scanner(System.in);
        String word = input_word.nextLine();
        input_word.close();

        System.out.println(reverseString(word));

    }

}