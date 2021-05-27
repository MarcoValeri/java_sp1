public class Bug {

    private int position, step;

    public Bug(int position) {
        this.position = position;
        step = 1;
    }

    public void turn() {
        step = -1;
    }

    public void move() {
        position+= step;
    }

    public int getPosition() {
        return position;
    }

}