public class Address {

    String number, street, city, postcode;

    public Address(String number, String street, String city, String postcode) {
        this.number = number;
        this.street = street;
        this.city = city;
        this.postcode = postcode;
    }

    public void printAddress() {
        System.out.println(number + ", " + street);
        System.out.println(city + " - " + postcode);
    }

    public boolean comesBefore(Address other) {

        return postcode.compareTo(other.postcode) < 0;

    }

}