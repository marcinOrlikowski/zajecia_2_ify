import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        //zadanie 1
        AgeVerification();
        /**
         * Output:
         * Podaj wiek:
         * asd
         * Nieprawidłowy format - podaj liczbe całkowitą
         * Podaj wiek:
         * 0
         * Podano nieprawidłowy wiek
         * Podaj wiek:
         * 152
         * Podano nieprawidłowy wiek
         * Podaj wiek:
         * 19
         * Jesteś pełnoletni
         */
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
        //zadanie 3
        ageCategorization();
        /**
         * Output:
         * Podaj wiek:
         * asd
         * Nieprawidłowy format - podaj liczbe całkowitą
         * Podaj wiek:
         * 12
         * Nastolatek
         */
    }

    private static void AgeVerification() {
        if (readAge() < 18)
            System.out.println("Nie jesteś pełnoletni");
        else
            System.out.println("Jesteś pełnoletni");
    }

    private static int readAge() {
        int age = 0;
        boolean isAgeCorrect = false;
        do {
            try {
                System.out.println("Podaj wiek:");
                age = SCANNER.nextInt();
                if (age <= 0 || age > 150)
                    System.err.println("Podano nieprawidłowy wiek");
                else isAgeCorrect = true;
            } catch (Exception e) {
                System.err.println("Nieprawidłowy format - podaj liczbe całkowitą");
            } finally {
                SCANNER.nextLine();
            }
        } while (!isAgeCorrect);
        return age;
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

    private static void ageCategorization() {
        int age = readAge();
        if (age < 12) System.out.println("Dziecko");
        else if (age < 18) System.out.println("Nastolatek");
        else if (age < 65) System.out.println("Dorosły");
        else System.out.println("Senior");
    }
}