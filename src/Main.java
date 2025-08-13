import java.time.DayOfWeek;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    private static final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {
        //zadanie 5
        switchDay();
        /**
         * Output:
         * Podaj liczbę całkowitą:
         * 3
         * Środa
         */

    }

    private static void switchDay() {
        int day = readNumber();
        switch (day){
            case 1 : {
                System.out.println("Poniedziałek");
                break;
            }
            case 2 : {
                System.out.println("Wtorek");
                break;
            }
            case 3 : {
                System.out.println("Środa");
                break;
            }
            case 4 : {
                System.out.println("Czwartek");
                break;
            }
            case 5 : {
                System.out.println("Piątek");
                break;
            }
            case 6 : {
                System.out.println("Sobota");
                break;
            }
            case 7 : {
                System.out.println("Niedziela");
                break;
            }
            default: {
                System.out.println("Nieznany dzień");
            }
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