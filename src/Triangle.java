import static java.lang.Math.*;

public class Triangle extends Shape {

    int x1, x2, x3, y1, y2, y3;


    public Triangle(Colors colors, String name, int x1, int x2, int x3, int y1, int y2, int y3) {
        super(colors, name);
        this.x1 = x1;
        this.x2 = x2;
        this.x3 = x3;
        this.y1 = y1;
        this.y2 = y2;
        this.y3 = y3;
    }

    double line1;
    double line2;
    double line3;
    double p;

    @Override
    public double getS() {
        line1 = sqrt(pow((x2 - x1), 2) + pow((y2 - y1), 2));
        line2 = sqrt(pow((x3 - x1), 2) + pow((y3 - y1), 2));
        line3 = sqrt(pow((x3 - x2), 2) + pow((y3 - y2), 2));
        p = (line1 + line2 + line3) / 2;
        s = sqrt(p*(p-line1)*(p-line2)*(p-line3));


        return s;
    }

}
