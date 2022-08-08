public class Main {
    public static void main(String[] args) {
        Triangle triangle1 = new Triangle(Colors.WHITE, "Triangle1", 1, 31, 42, 6, 82, 90);
        triangle1.getInfo();

        System.out.println();

        Triangle triangle2 = new Triangle(Colors.BLACK, "Triangle2", 5, 31, 50, 68, 81, 330);
        triangle2.getInfo();
        System.out.println();
        Triangle triangle3 = new Triangle(Colors.YELLOW, "Triangle3", 1, 2, 6, 15, 99, 109);
        triangle3.getInfo();

        System.out.println();

        Triangle triangle4 = new Triangle(Colors.PINK, "Triangle4", 25, 31, 42, 6, 82, 100);
        triangle4.getInfo();

        System.out.println();

        Circle circle1 = new Circle(Colors.PINK, "Circle1", 25, "A");
        circle1.getInfo();

        System.out.println("Max S = " + maxS(triangle1.s,triangle2.s, triangle3.s, triangle4.s, circle1.s));


    }
    public static double maxS(double s1, double s2, double s3, double s4, double s5) {
        double maxValue = 0;
        if ((s1 > s2) && (s1 > s3) && (s1 > s4) && (s1 > s5)) {
           maxValue  = s1;
        }
        if ((s2 > s1) && (s2 > s3) && (s2 > s4) && (s2 > s5)) {
           maxValue  = s2;
        }
        if ((s3 > s2) && (s3 > s1) && (s3 > s4) && (s3 > s5)) {
           maxValue  = s3;
        }
        if ((s4 > s2) && (s4 > s3) && (s4 > s1) && (s4 > s5)) {
           maxValue  = s4;
        }
        if ((s5 > s2) && (s5 > s3) && (s5 > s4) && (s5 > s1)) {
           maxValue  = s5;
        }
        return maxValue;
    }
}

