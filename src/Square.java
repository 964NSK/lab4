import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Square extends Shape {
    Point a;
    Point b;
    public Square(Colors colors, String name, int leftAngle, Point a, Point b) {
        super(colors, name);
        this.leftAngle = leftAngle;
        this.a = a;
        this.b = b;
    }
    double leftAngle;


    @Override
    public double getS() {
        double  line1 = sqrt(pow((b.x - a.x), 2) + pow((b.y - a.y), 2));
        s = pow(line1, 2);
        return s;
    }
}
