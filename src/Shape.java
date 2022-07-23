public class Shape {
    public Shape(Colors colors, String name) {
        colorType = colors;
        this.name = name;
    }
    Colors colorType;
    public int a;
    final float P = (float) 3.14;
    public int b;
    public String name;
    public double s;

    public void getS() {
        s = a * b;
    }

}
