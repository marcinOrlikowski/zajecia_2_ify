import java.util.InputMismatchException;
import java.util.Scanner;


public class Main {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        //zadanie 4
        temperatureAssessment();
        /**
         * Output:
         * asd
         * Zły format - podaj liczbę całkowitą
         * Podaj liczbę całkowitą:
         * 15
         * Chłodno
         */
    }

    private static void temperatureAssessment() {
        int temperature = readNumber();
        if (temperature < 0)
            System.out.println("Mróz");
        else if (temperature < 16)
            System.out.println("Chłodno");
        else if (temperature < 26)
            System.out.println("Ciepło");
        else
            System.out.println("Gorąco");
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