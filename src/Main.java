import java.util.Scanner;

public class Main {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        //zadanie 9
        calculate();
        /**
         * Output:
         * Podaj pierwszą liczbę całkowitą:
         * 10
         * Podaj drugą liczbę całkowitą:
         * 3
         * Jakie działanie chcesz wykonać:
         * (+, -, *, /, %)
         * %
         * 10 % 3 = 1
         */

    }

    private static void calculate() {
        System.out.println("Podaj pierwszą liczbę całkowitą:");
        int a = SCANNER.nextInt();
        System.out.println("Podaj drugą liczbę całkowitą:");
        int b = SCANNER.nextInt();
        SCANNER.nextLine();
        System.out.println("Jakie działanie chcesz wykonać:");
        System.out.println("(+, -, *, /, %)");
        String operator = SCANNER.nextLine();
        switch (operator) {
            case "+" -> System.out.println(a + " + " + b + " = " + (a + b));
            case "-" -> System.out.println(a + " - " + b + " = " + (a - b));
            case "*" -> System.out.println(a + " * " + b + " = " + (a * b));
            case "/" -> System.out.println(a + " / " + b + " = " + (a / b));
            case "%" -> System.out.println(a + " % " + b + " = " + (a % b));
            default -> System.out.println("Nie rozpoznano znaku działania");
        }

    }
}