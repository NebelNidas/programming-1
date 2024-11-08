package quiz;

import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        int random = 1 + (int) (Math.random() * 1_000);
        Scanner scanner = new Scanner(System.in);
        long startTime = System.currentTimeMillis();
        int guesses = 0;

        while (true) {
            System.out.println("Bitte eine Zahl eingeben: ");
            int guess = scanner.nextInt();
            guesses++;

            if (guess < random) {
                System.out.println("Ihre Zahl ist zu niedrig!");
            } else if (guess > random) {
                System.out.println("Ihre Zahl ist zu hoch!");
            } else {
                break;
            }
        }

        System.out.println();
        System.out.println("Treffer!");
        System.out.println("Sie haben " + guesses + " Versuche benötigt.");
        System.out.println("Sie haben " + (System.currentTimeMillis() - startTime) / 1000 + " Sekunden benötigt.");
        scanner.close();
    }
}
