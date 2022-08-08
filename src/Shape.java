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

    public double getS() {
        s = a * b;
        return s;
    }
    public void getInfo () {
        System.out.println("Type of Shape: " + name);
        System.out.println("S = " + getS());
        System.out.println("Color: " + colorType);
    }

}
