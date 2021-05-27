public class Moth {

    double x, y;

    public Moth(double initialX, double initialY) {
        x = initialX;
        y = initialY;
    }

    public void moveToLight(double lightX, double lightY) {
        x = (lightX - x) / 2;
        y = (lightY - y) / 2;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

}