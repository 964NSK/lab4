public class Circle extends Shape {
    public Circle(Colors colors, String name, double radius, Point a) {
        super(colors, name);
        this.a = a;
        this.radius = radius;
    }
    private Point a;
    public double radius;

    @Override
    public double getS() {
        s = 2 * P * radius;
        return s;
    }

}
