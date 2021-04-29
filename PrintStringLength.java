public class PrintStringLength {
    
    /*
    * Create a method that gets a 
    * @parameter String and 
    * print out a message with its length
    */
    public static void printLength(String s) {
        System.out.println(s + " has length " + s.length());
    }

    public static void main(String[] args) {
        printLength("Hello");
    }

}
