import java.util.Scanner;
import static core.Calculation.calc;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите арифметическое выражение");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        try {
            String result = calc(input);
            System.out.println("Результат: " + result);
        } catch (IllegalArgumentException userError) {
            System.out.println("Ошибка: " + userError.getMessage());
        }

    }
}