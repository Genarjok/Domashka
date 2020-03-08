import java.awt.geom.Point2D;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Homework1_4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите координату 1й точки по оси X:");
        double x1 = Double.parseDouble(scanner.nextLine());

        System.out.println("Введите координату 1й точки по оси Y:");
        double y1 = Double.parseDouble(scanner.nextLine());

        System.out.println("Введите координату 2й точки по оси X:");
        double x2 = Double.parseDouble(scanner.nextLine());

        System.out.println("Введите координату 2й точки по оси Y:");
        double y2 = Double.parseDouble(scanner.nextLine());

        double distance = Point2D.distance(x1, y1, x2, y2);
        System.out.println("Расстояния между двумя точками (" + x1 + "," + y1 + ") и (" + x2 + "," + y2 + ") равно "
                + distance);
    }
}
