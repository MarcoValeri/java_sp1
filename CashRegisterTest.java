import java.util.Scanner;

public class CashRegisterTest {

    public static void main(String[] args) {

        // object r1
        CashRegister r1 = new CashRegister();
        
        System.out.print("Please, insert the price of the first item: ");
        Scanner input_price = new Scanner(System.in);
        double price = input_price.nextDouble();
        r1.addItem(price);
        System.out.println();

        System.out.print("Please, insert the price of the second item: ");
        price = input_price.nextDouble();
        r1.addItem(price);
        System.out.println();

        System.out.print("Please, insert the price of the third item: ");
        price = input_price.nextDouble();
        r1.addItem(price);
        System.out.println();

        System.out.println("r1");
        System.out.println("Total cost is " + r1.getTotal());
        System.out.println("The number of items bought is " + r1.getCount());
        System.out.println();

        // object r2
        CashRegister r2 = new CashRegister();

        System.out.print("Please, insert the price of the first item: ");
        price = input_price.nextDouble();
        r2.addItem(price);
        System.out.println();

        System.out.print("Please, insert the price of the second item: ");
        price = input_price.nextDouble();
        r2.addItem(price);
        System.out.println();

        System.out.print("Please, insert the price of the third item: ");
        price = input_price.nextDouble();
        r2.addItem(price);
        System.out.println();

        System.out.println("r2");
        System.out.println("Total cost is " + r2.getTotal());
        System.out.println("The number of items bought is " + r2.getCount());
        System.out.println();

        // object r3
        CashRegister r3 = new CashRegister();

        System.out.print("Please, insert the price of the first item: ");
        price = input_price.nextDouble();
        r3.addItem(price);
        System.out.println();

        System.out.print("Please, insert the price of the second item: ");
        price = input_price.nextDouble();
        r3.addItem(price);
        System.out.println();

        System.out.print("Please, insert the price of the third item: ");
        price = input_price.nextDouble();
        r3.addItem(price);
        System.out.println();

        System.out.println("r3");
        System.out.println("Total cost is " + r3.getTotal());
        System.out.println("The number of items bought is " + r3.getCount());
        System.out.println();

        input_price.close();

    }

}