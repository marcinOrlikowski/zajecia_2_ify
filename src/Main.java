import java.util.InputMismatchException;
import java.util.Scanner;


public class Main {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        //zadanie 2
        isEven();
        /**
         * Output:
         * Podaj liczbę całkowitą:
         * asd
         * Zły format - podaj liczbę całkowitą
         * Podaj liczbę całkowitą:
         * 15.5
         * Zły format - podaj liczbę całkowitą
         * Podaj liczbę całkowitą:
         * 20
         * Parzysta
         */
    }

    private static void isEven() {
        if (readNumber() % 2 == 0)
            System.out.println("Parzysta");
        else
            System.out.println("Nieparzysta");
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