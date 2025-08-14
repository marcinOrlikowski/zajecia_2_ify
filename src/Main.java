import java.util.Scanner;

public class Main {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        //zadanie 12
        isDateCorrect();
        /**
         * Output:
         * Podaj dzień:
         * 29
         * Podaj miesiąc:
         * 2
         * Podaj rok:
         * 1992
         * Data poprawna
         */

    }

    private static void isDateCorrect() {
        System.out.println("Podaj dzień:");
        int day = SCANNER.nextInt();
        System.out.println("Podaj miesiąc:");
        int month = SCANNER.nextInt();
        System.out.println("Podaj rok:");
        int year = SCANNER.nextInt();

        if (year > 0) {
            switch (month) {
                case 1, 3, 5, 7, 8, 10, 12 -> {
                    if (day >= 1 && day <= 31) {
                        System.out.println("Data poprawna");
                    } else
                        System.out.println("Data niepoprawna");
                }
                case 4, 6, 9, 11 -> {
                    if (day >= 1 && day <= 30) {
                        System.out.println("Data poprawna");
                    } else
                        System.out.println("Data niepoprawna");

                }
                case 2 -> {
                    if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
                        if (day >= 1 && day <= 29) {
                            System.out.println("Data poprawna");
                        } else
                            System.out.println("Data niepoprawna");
                    } else if (day >= 1 && day <= 28) {
                        System.out.println("Data poprawna");
                    } else
                        System.out.println("Data niepoprawna");
                }
                default -> {
                    System.out.println("Data niepoprawna");
                }
            }
        } else
            System.out.println("Data niepoprawna");


}
}