package plateau;

public class Plateau {
    public static void main(String[] args) {
        int[] altitudes = {10, 17, 17, 17, 17, 17, 11, 10, 14, 10, 11, 11, 11, 9, 13, 15, 16, 16, 13};

        boolean onPotentialPlateau = false;
        int plateauLength = 0;
        int plateauIndex = 0;

        for (int i = 1; i < altitudes.length; i++) {
            int lastHeight = altitudes[i-1];
            int height = altitudes[i];

            if (height == lastHeight) {
                plateauLength += (plateauLength == 0 ? 2 : 1);
                continue;
            }

            if (height > lastHeight) {
                onPotentialPlateau = true;
                plateauLength = 0;
                plateauIndex = i;
                continue;
            }

            if (height < lastHeight && onPotentialPlateau) {
                if (plateauLength > 0) {
                    System.out.println("Index: %s Height: %s Length: %s".formatted(plateauIndex, lastHeight, plateauLength));
                }

                onPotentialPlateau = false;
                plateauLength = 0;
            }
        }
    }
}
