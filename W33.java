public class W33 {

    public static void main(String[] args) {
        
        int num = 0;
        int sum = 0;

        while (num <= 100) {
            sum+= num;
            num+= 2;
        }

        System.out.println("Sum: " + sum);

    }

}