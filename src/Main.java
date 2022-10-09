public class Main {
    public static void main(String[] args) {
        ShapePrint print = new ShapePrint();

        Shape circle = new Circle();
        Shape triangle = new Triangle();
        Shape rectangle = new Rectangle();
        Shape pentagon = new Pentagon();
        Shape hexagon = new Hexagon();

        print.name(circle);
        print.name(triangle);
        print.name(rectangle);
        print.name(pentagon);
        print.name(hexagon);

    }
}
