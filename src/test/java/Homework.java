import org.junit.jupiter.api.Test;
import org.w3c.dom.ls.LSOutput;

public class Homework {
    @Test
    public void objavlenije() {
        String carBrand = "Жига";
        String mileage = "999999";
        String price = "00.01";

        System.out.println("Продаем машину " + carBrand + " с пробегом " + mileage + " за " + price + " денег");


        double fuelPrice = 3.57;
        double consumption = 500;
        double range = 1000;
        double costs = range / 100 * consumption * fuelPrice;

        System.out.println("Стоимость полёта " + costs + " EUR");

    }

}