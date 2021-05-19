import java.util.Scanner;

public class W38 {

    public static void main(String[] args) {
        
        System.out.print("Please, insert a string: ");
        Scanner input_string = new Scanner(System.in);
        String str = input_string.nextLine();

        int strLength = str.length();
        String output = "";
        for (int i = 0; i < strLength; i++) {

            char character = str.charAt(i);
            if (
                character == 'a' ||
                character == 'e' ||
                character == 'u' ||
                character == 'i' ||
                character == 'o'
                ) {
                    output+= "-";
                } else {
                    output+= str.charAt(i);
                }

        }

        input_string.close();

        System.out.println(output);

    }

}