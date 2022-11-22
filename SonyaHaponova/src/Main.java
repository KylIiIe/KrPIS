public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.x = 10;
        circle.y = 20;
        circle.radius = 15;
        circle.color = "red";

        System.out.println(circle);

        Circle anotherCircle = (Circle) circle.clone();
        System.out.println(anotherCircle);

        Rectangle rectangle = new Rectangle();
        rectangle.width = 10;
        rectangle.height = 20;
        rectangle.color = "blue";

        System.out.println(rectangle);
    }
}