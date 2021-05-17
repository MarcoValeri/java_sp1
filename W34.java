public class W34 {

    public static void main(String[] args) {
        
        int sum = 0;
        int num = 1;
        int temporary = 0;
        while (temporary < 100) {
            temporary = num * num;
            System.out.println("Squares: " + temporary);
            sum+= temporary;
            num++;
        }

        System.out.println("Sum: " + sum);

    }

}