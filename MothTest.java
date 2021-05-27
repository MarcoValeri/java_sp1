public class MothTest {
    
    public static void main(String[] args) {
        
        // Obj Moth1
        Moth moth1 = new Moth(10, 5);
        moth1.moveToLight(10, 5);
        System.out.println("x: " + moth1.getX());
        System.out.println("y: " + moth1.getY());

        moth1.moveToLight(5, 15);
        System.out.println("x: " + moth1.getX());
        System.out.println("y: " + moth1.getY());

        moth1.moveToLight(20, 25);
        System.out.println("x: " + moth1.getX());
        System.out.println("y: " + moth1.getY());

    }

}
