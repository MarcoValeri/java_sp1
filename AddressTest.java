import java.security.cert.TrustAnchor;

public class AddressTest {

    public static void main(String[] args) {
        
        // Obj addressOne
        Address addressOne = new Address("7", "Gloucester Drive", "London", "N4 2LE");
        addressOne.printAddress();

        // Obj addressTwo
        Address addressTwo = new Address("1", "Oxford Street", "London", "N1");
        addressTwo.printAddress();

        if (addressOne.comesBefore(addressTwo) == true) {
            System.out.println("Comes before");
        } else {
            System.out.println("Comes after");
        }

    }

}