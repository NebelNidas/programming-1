package xmastree;

public class XMasTree {
    public static void main(String[] args) {
        int height = 5;

        // Angel indentation
        for (int i = 1; i <= height; i++) {
            System.out.print(" ");
        }

        // Angel
        System.out.println("+");


        // Leaves
        for (int line = 1; line <= height; line++) {
            int spacesInThisLine = height - line + 1;
            int starsInThisLine = line * 2 - 1;

            for (int i = 1; i <= spacesInThisLine; i++) {
                System.out.print(" ");
            }

            for (int star = 1; star <= starsInThisLine; star++) {
                System.out.print("*");
            }

            System.out.println();
        }


        // Trunk indentation
        for (int i = 1; i <= height; i++) {
            System.out.print(" ");
        }

        // Trunk
        System.out.println("U");
    }
}
