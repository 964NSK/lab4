import static java.lang.Math.*;

public class Triangle extends Shape {

    private Point a;
    private Point b;
    private Point c;
    public Triangle(Colors colors, String name, Point a, Point b, Point c) {
        super(colors, name);
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public Point getA() {
        return a;

    }
    public Point getB() {
        return b;

    }
    public Point getC() {
        return c;

    }




    @Override
    public double getS() {
       double  line1 = sqrt(pow((b.x - a.x), 2) + pow((b.y - a.y), 2));
       double  line2 = sqrt(pow((c.x - a.x), 2) + pow((c.y - a.y), 2));
       double  line3 = sqrt(pow((c.x - b.x), 2) + pow((c.y - b.y), 2));
       double  p = (line1 + line2 + line3) / 2;
        s = abs(sqrt(p*(p-line1)*(p-line2)*(p-line3)));


        return s;
    }


}
