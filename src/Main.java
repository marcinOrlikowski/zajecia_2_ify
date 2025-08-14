import java.util.Scanner;

public class Main {
    private static final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {
        //zadanie 10
        passwordValidation();
        /**
         * Output:
         * Wprowadź hasło zaczynające się z dużej litery (min 8 znaków)
         * Trudne123
         * Hasło OK
         */

    }

    private static void passwordValidation() {
        System.out.println("Wprowadź hasło zaczynające się z dużej litery (min 8 znaków)");
        String password = SCANNER.nextLine();
        if (password.length() < 8) {
            System.out.println("Hasło za krótkie");
        } else if (!Character.isUpperCase(password.charAt(0))) {
            System.out.println("Hasło musi zaczynać się z dużej litery");
        } else
            System.out.println("Hasło OK");
    }
}