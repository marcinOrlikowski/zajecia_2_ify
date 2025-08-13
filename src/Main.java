import java.util.Scanner;

public class Main {
    private static final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {
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

    private static void ageCategorization() {
        int age = readAge();
        if (age < 12)
            System.out.println("Dziecko");
        else if (age < 18)
            System.out.println("Nastolatek");
        else if (age < 65)
            System.out.println("Dorosły");
        else
            System.out.println("Senior");
    }

    private static int readAge(){
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
                System.err.println("Nieprawidłowy format - podaj liczbe całkowitą");;
            } finally {
                SCANNER.nextLine();
            }
        } while (!isAgeCorrect);

        return age;
    }
}