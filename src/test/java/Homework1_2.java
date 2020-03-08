import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Homework1_2 {

    private static final double FUEL_PRICE_PER_LITER = 3.57;
    private static final int KM_INDEX = 100;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите расстояние:");
        double distance = Double.parseDouble(scanner.nextLine());

        System.out.println("Введите расход самолёта на 100км:");
        double fuelConsumption = Double.parseDouble(scanner.nextLine());

        BigDecimal price = calculatePrice(fuelConsumption, distance);

        System.out.println("На перелёт длиной в " + distance + "км и с расходом топлива "
                + fuelConsumption + " литров на 100км затрачено " + price + " денег");
    }

    private static BigDecimal calculatePrice(double fuelConsumption, double distance) {
        return new BigDecimal(distance / KM_INDEX * fuelConsumption * FUEL_PRICE_PER_LITER)
                .setScale(2, RoundingMode.HALF_EVEN);
    }
}
