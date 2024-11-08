package coordinates;

public class Coordinates {
    public static void main(String[] args) {
        int maxX = 6;
        int maxY = 5;

        for (int x = 1; x <= maxX; x++) {
            for (int y = 1; y <= maxY; y++) {
                System.out.print("(" + x + "," + y + ") ");
            }

            System.out.println();
        }
    }
}
