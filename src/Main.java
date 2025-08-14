import java.util.Scanner;

public class Main {
    private static final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {
        //zadanie 8
        vatCheck();
        /**
         * Output:
         * Podaj kategorie produktu:
         * 'żywność', 'książki', 'usługi', 'ubrania', 'elektronika', 'inne'
         * Żywność
         * Stawka vat dla podanej kategorii wynosi 5%
         */
    }

    private static void vatCheck() {
        System.out.println("Podaj kategorie produktu:");
        System.out.println("'żywność', 'książki', 'usługi', 'ubrania', 'elektronika', 'inne'");
        String input = SCANNER.nextLine();
        switch (input.toLowerCase()) {
            case "żywność", "książki" -> System.out.println("Stawka vat dla podanej kategorii wynosi 5%");
            case "usługi", "ubrania", "elektronika", "inne" -> System.out.println("Stawka vat dla podanej kategorii wynosi 23%");
            default -> System.out.println("Nie rozpoznano kategorii");
        }
    }
}