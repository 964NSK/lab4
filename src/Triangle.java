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

    double line1 = findLine(x1, y1, x2, y2);
    double line2 = findLine(x1, y1, x3, y3);
    double line3 = findLine(x2, y2, x3, y3);
    double p = getP(line1, line2, line3);




    public double findLine(int pointX1, int pointY1, int pointX2, int pointY2) {
        double line = sqrt(pow((pointX2 - pointX1), 2) + pow((pointY2 - pointY1), 2));
        return line;
    }

    public double getP(double l1, double l2, double l3) {
        double prmtr = (l1 + l2 + l3) / 2;
        return prmtr;

    }

    @Override
    public void getS() {
        s = sqrt(p*(p-line1)*(p-line2)*(p-line3));


    }

}
