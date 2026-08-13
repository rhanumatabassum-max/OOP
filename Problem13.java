import java.util.Scanner;

public class RectangleAreaPerimeter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter width of rectangle: ");
        double width = scanner.nextDouble();

        System.out.print("Enter height of rectangle: ");
        double height = scanner.nextDouble();

        double area = width * height;
        double perimeter = 2 * (width + height);

        System.out.println("Area is = " + area);
        System.out.println("Perimeter is = " + perimeter);

        scanner.close();
    }
}
