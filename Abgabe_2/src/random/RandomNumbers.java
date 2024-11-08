package random;

public class RandomNumbers {
    public static void main(String[] args) {
        int random = 0;
        int counter = 0;

        while (random != 10_000) {
            counter++;
            random = (int) (Math.random() * 100_000);

            System.out.println(counter + ": " + random);
        }
    }
}
