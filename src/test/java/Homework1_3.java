import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.ChronoField;
import java.util.Locale;
import java.util.Scanner;

public class Homework1_3 {

    public static final DateTimeFormatter DDMMMMYYYY =
            DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.forLanguageTag("ru"));

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите персональный код:");
        String personalCode = scanner.nextLine();

        personalCodeCheck(personalCode);

        System.out.println("Твоя дата рождения " + parsePersonalCode(personalCode).format(DDMMMMYYYY) + " года");
    }

    private static void personalCodeCheck(String personalCode) {
        String[] personalCodeParts = personalCode.split("-");

        if (personalCodeParts[0].length() != 6) {
            throw new RuntimeException("Неправильная первая часть кода");
        }
        if (personalCodeParts[1].length() != 5) {
            throw new RuntimeException("Неправильная вторая часть кода");
        }
    }

    private static LocalDate parsePersonalCode(String personalCode) {
        String[] personalCodeParts = personalCode.split("-");
        String firstPart = personalCodeParts[0];
        int century = Integer.parseInt(personalCodeParts[1].substring(0, 1));

        int year;
        if (century == 0) {
            year = 1800;
        } else if (century == 1) {
            year = 1900;
        } else if (century == 2) {
            year = 2000;
        } else {
            throw new RuntimeException("Неправильная вторая часть кода");
        }

        DateTimeFormatter formatter = new DateTimeFormatterBuilder()
                .appendPattern("ddMM")
                .appendValueReduced(ChronoField.YEAR, 2, 2, year)
                .toFormatter();

        return LocalDate.parse(firstPart, formatter);
    }
}
