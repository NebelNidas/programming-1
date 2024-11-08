package triplets;

public class Triplets {
    public static void main(String[] args) {
        int rollCount = 0;
        boolean tripletOfOnes = false;
        boolean tripletOfTwos = false;
        boolean tripletOfThrees = false;
        int accumulatedARolls = 0;
        int accumulatedBRolls = 0;
        int accumulatedCRolls = 0;

        while (true) {
            int a = 1 + (int) (Math.random() * 6);
            int b = 1 + (int) (Math.random() * 6);
            int c = 1 + (int) (Math.random() * 6);

            rollCount++;
            accumulatedARolls += a;
            accumulatedBRolls += b;
            accumulatedCRolls += c;

            System.out.println("Wurf %s: %s, %s, %s".formatted(rollCount, a, b, c));

            if (a == b && b == c) {
                System.out.println("Trippel!");

                tripletOfOnes |= a == 1;
                tripletOfTwos |= a == 2;
                tripletOfThrees |= a == 3;

                if (tripletOfOnes && tripletOfTwos && tripletOfThrees) {
                    break;
                }
            }

            try {
                Thread.sleep(5);
            } catch (InterruptedException ignored) {
            }
        }

        System.out.println();
        System.out.println("Alle Trippel (Einser, Zweier und Dreier) waren dabei!");
        System.out.println("Mittelwert Würfel 1: "+ (double) accumulatedARolls / rollCount);
        System.out.println("Mittelwert Würfel 2: "+ (double) accumulatedBRolls / rollCount);
        System.out.println("Mittelwert Würfel 3: "+ (double) accumulatedCRolls / rollCount);
    }
}
