public class TallyCounterTest {
    
    public static void main(String[] args) {
        
        // Obj counterOne
        TallyCounter counterOne = new TallyCounter();
        counterOne.setLimit(5);
        counterOne.next();
        counterOne.next();
        counterOne.next();
        counterOne.next();
        counterOne.next();
        counterOne.next();

    }

}
