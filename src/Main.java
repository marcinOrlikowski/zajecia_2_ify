import java.util.Scanner;

public class Main {
    private static final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {
        //zadanie 11
        leapYear();
        /**
         * Output:
         * Podaj rok:
         * 1992
         * 1992 jest rokiem przestępnym
         */
    }

    private static void leapYear() {
        System.out.println("Podaj rok:");
        int year = SCANNER.nextInt();
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println(year + " jest rokiem przestępnym");
        } else
            System.out.println(year + " nie jest rokiem przestępnym");
    }
}