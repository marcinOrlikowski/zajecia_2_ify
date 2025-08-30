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

}