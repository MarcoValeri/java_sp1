public class TallyCounter {

    private int people, limit;

    public TallyCounter() {
        people = 0;
        limit = 0;
    }

    public void setLimit(int maximum) {
        limit = maximum;
    }

    public void next() {
        people++;

        if (people >= limit) {
            System.out.println("Limit exceeded");
            setLimit(0);
        } else {
            System.out.println("Limit not exceeded");
        }

    }

    public static void main(String[] args) {
        System.out.println("Hello Java");
    }

}