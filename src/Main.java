import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    private static final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {
        //zadanie 6
        dayOfWeek();
        /**
         * Output:
         * Podaj liczbę całkowitą:
         * asd
         * Zły format - podaj liczbę całkowitą
         * Podaj liczbę całkowitą:
         * 3
         * Środa
         */
    }

    private static void dayOfWeek() {
        switch (readNumber()){
            case 1 -> System.out.println("Poniedziałek");
            case 2 -> System.out.println("Wtorek");
            case 3 -> System.out.println("Środa");
            case 4 -> System.out.println("Czwartek");
            case 5 -> System.out.println("Piątek");
            case 6 -> System.out.println("Sobota");
            case 7 -> System.out.println("Niedziela");
            default -> System.out.println("Nieznany dzień");
        }
    }

    private static int readNumber() {
        int number = 0;
        boolean isValid = false;
        do {
            try {
                System.out.println("Podaj liczbę całkowitą:");
                number = SCANNER.nextInt();
                isValid = true;
            } catch (InputMismatchException e) {
                System.err.println("Zły format - podaj liczbę całkowitą");
            } finally {
                SCANNER.nextLine();
            }
        } while (!isValid);
        return number;
    }
}