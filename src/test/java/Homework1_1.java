import java.util.Scanner;

public class Homework1_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите марку авто:");
        String model = scanner.nextLine();

        System.out.println("Введите цену:");
        String price = scanner.nextLine();

        System.out.println("Введите пробег:");
        String mileage = scanner.nextLine();

        System.out.println("Продаем машину " + model + " с пробегом " + mileage + " за " + price + " денег");
    }
}
