package maximum;

public class Maximum {
    public static void main(String[] args) {
        int x = 100;
        int y = 200;
        int z = -20;
        int maximum = 0;
        int counter = 0;

        if (x > y) {
            maximum = x;
        } else {
            maximum = y;
        }

        if (maximum < z) {
            maximum = z;
        }

        if (x < 0) {
            counter++;
        }

        if (y < 0) {
            counter++;
        }

        if (z < 0) {
            counter++;
        }

        Math.max(x, y);

        System.out.println("x ist " + x);
        System.out.println("y ist " + y);
        System.out.println("z ist " + z);
        System.out.println("(1) Das Maximum ist " + maximum);
        System.out.println("(2) Die Anzahl der negativen Zahlen ist " + counter);
    }
}