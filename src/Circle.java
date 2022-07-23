public class Circle extends Shape {
    public Circle(Colors colors, String name, int radius, int centr) {
        super(colors, name);
        this.centr = centr;
        this.radius = radius;
    }
    public int centr;

    public int radius;

    @Override
    public void getS() {
        s = 2 * P * radius;
    }

}
