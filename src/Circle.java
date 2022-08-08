public class Circle extends Shape {
    public Circle(Colors colors, String name, int radius, String centr) {
        super(colors, name);
        this.centr = centr;
        this.radius = radius;
    }
    public String centr;


    public int radius;

    @Override
    public double getS() {
        s = 2 * P * radius;
        return s;
    }

}
