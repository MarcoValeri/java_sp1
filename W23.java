import java.util.Scanner;

public class W23 {

    /*
    * Create a method that compares two
    * @parameters string and 
    * @return negative integer if first string is lexicographic order than second string
    * @return 0 string are equal in lexicographic order
    * @return positive integer if first string is not in lexicographic order than second string
    */
    public static int lexicographic(String first_word, String second_word) {
        return first_word.compareTo(second_word);
    }

    /*
    * Create a method that prompts three strings and
    * prints them in lexicographical order
    */
    public static void lexicographicalOrder() {

        System.out.println("Please, insert three words");

        Scanner first_input = new Scanner(System.in);
        System.out.print("First word: ");
        String first = first_input.next();

        Scanner second_input = new Scanner(System.in);
        System.out.print("Second word: ");
        String second = second_input.next();

        Scanner third_input = new Scanner(System.in);
        System.out.print("Third word: ");
        String third = third_input.next();

        String output = "";

        if (lexicographic(first, second) < 0 && lexicographic(first, third) < 0) {
            if (lexicographic(second, third) < 1) {
                output+= first + " " + second + " " + third;
            } else {
                output+= first + " " + third + " " + second;
            }
        } else if (lexicographic(second, first) < 0 && lexicographic(second, third) < 0) {
            if (lexicographic(first, third) < 0) {
                output+= second + " " + first + " " + third;
            } else {
                output+= second + " " + third + " " + first;
            }
        } else if (lexicographic(third, first) < 0) {
            if (lexicographic(first, second) < 0) {
                output+= third + " " + first + " " + second;
            } else {
                output+= third + " " + second + " " + first; 
            }
        } else {
            if (lexicographic(first, second) == 0) {
                if (lexicographic(first, third) < 0) {
                    output+= first + " " + second + " " + third;
                } else {
                    output+= third + " " + first + " " + third;
                }
            } else if (lexicographic(first, third) == 0) {
                if (lexicographic(first, second) < 0) {
                    output+= first + " " + third + " " + second;
                } else {
                    output+= second + " " + first + " " + second;
                }
            }
        }

        first_input.close();
        second_input.close();
        third_input.close();

        System.out.println(output);

    }

    public static void main(String[] args) {
        lexicographicalOrder();
    }

}