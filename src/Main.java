import java.util.Random;
import java.util.Scanner;

public class Main {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        //zadanie 14
        rockPaperScissors();
        /**
         * Output:
         * Co wybierasz?
         * k - Kamień, p - Papier, n - Nożyce
         * n
         * Wygrywasz - nożyce wygrywają z papierem
         */

    }

    private static void rockPaperScissors() {
        Random random = new Random();
        System.out.println("Co wybierasz?");
        System.out.println("k - Kamień, p - Papier, n - Nożyce");
        String userChoice = SCANNER.nextLine();
        String computerChoice = "";

        switch (random.nextInt(3)) {
            case 0 -> computerChoice = "k";
            case 1 -> computerChoice = "p";
            case 2 -> computerChoice = "n";
        }

        switch (userChoice.toLowerCase()) {
            case "k" -> {
                if (computerChoice.equals("p")) {
                    System.out.println("Przegrywasz - kamień przegrywa z papierem");
                } else if (computerChoice.equals("n")) {
                    System.out.println("Wygrywasz - kamień wygrywa z nożycami");
                } else
                    System.out.println("Remis");
            }
            case "p" -> {
                if (computerChoice.equals("p")) {
                    System.out.println("Remis");
                } else if (computerChoice.equals("n")) {
                    System.out.println("Przegrywasz - papier przegrywa z nożycami");
                } else
                    System.out.println("Wygrywasz - papier wygrywa z kamieniem");
            }
            case "n" -> {
                if (computerChoice.equals("p")) {
                    System.out.println("Wygrywasz - nożyce wygrywają z papierem");
                } else if (computerChoice.equals("n")) {
                    System.out.println("Remis");
                } else
                    System.out.println("Przgrywasz - nożyce przegrywają z kamieniem");
            }
            default -> {
                System.out.println("Nieprawdiłowy wybór");
            }
        }
        SCANNER.close();
    }

}