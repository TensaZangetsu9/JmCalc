package core;

public class Calculation {
    public static String calc(String input) {
        String[] tokens = input.split(" ");
        if (tokens.length != 3) {
            throw new IllegalArgumentException("Введите 2 числа");
        }
        int a = Integer.parseInt(tokens[0]);
        int b = Integer.parseInt(tokens[2]);

        if (a > 10 || b > 10 || a < 1 || b < 1) {
            throw new IllegalArgumentException("Введите числа от 1 до 10");
        }

        String operation = tokens[1];
        int result = switch (operation) {
            case "+" -> a + b;
            case "-" -> a - b;
            case "/" -> a / b;
            case "*" -> a * b;
            default -> throw new IllegalArgumentException("Недопустимая операция");

        };


        return Integer.toString(result);
    }
}
