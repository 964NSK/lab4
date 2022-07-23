public class Square extends Shape {
    public Square(Colors colors, String name, int leftAngle, int line) {
        super(colors, name);
        this.leftAngle = leftAngle;
        this.line = line;
    }
    int leftAngle;
    int line;

    @Override
    public double getS() {
        s = line * line;
        return s;
    }
}
