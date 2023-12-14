public class Triangle {

    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getArea() {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    public double getPerimeter() {
        return a + b + c;
    }

    public void print() {
        System.out.println("Сторона a: " + a);
        System.out.println("Сторона b: " + b);
        System.out.println("Сторона c: " + c);
        System.out.println("Площа: " + getArea());
        System.out.println("Периметр: " + getPerimeter());
    }

    public static void main(String[] args) {
        Triangle triangle = new Triangle(3, 4, 5);
        triangle.print();
    }
}