public class BugTest {

    public static void main(String[] args) {
    
        Bug bugsy = new Bug(10);
        bugsy.move();
        System.out.println("Position: " + bugsy.getPosition());
        bugsy.turn();
        bugsy.move();
        System.out.println("Position: " + bugsy.getPosition());

    }

}