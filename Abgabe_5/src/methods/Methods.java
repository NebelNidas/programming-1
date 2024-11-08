package methods;

import java.util.Locale;

public class Methods {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int c = 20;

        printInfo();

        printVariable("a", a);
        printVariable("b", b);
        printVariable("c", c);

        printBoolean("even(a)", even(a));
        printRoundedDouble("pythagoras(a, b)", pythagoras(a, b));
        printMinimum("minimum(a, b, c)", minimum(a, b, c));

        printInfo();
    }

    public static boolean even(int a) {
        return a % 2 == 0;
    }

    public static double pythagoras(int a, int b) {
        return Math.sqrt(a * a + b * b);
    }

    public static int minimum(int a, int b, int c) {
        return Math.min(Math.min(a, b), c);
    }

    public static void printInfo() {
        System.out.println("--- Abgabe 5 ---");
    }

    public static void printVariable(String name, int value) {
        System.out.println("int %s: %s".formatted(name, value));
    }

    public static void printBoolean(String name, boolean value) {
        System.out.println("%s: %s".formatted(name, value));
    }

    public static void printRoundedDouble(String name, double value) {
        // String::formatted benutzt die System-Locale,
        // auf deutschen Betriebssystemen damit ein Komma statt eines Punktes,
        // wobei der Wichtel einen Fehler wirft. Überschreibbar ist die zur Formatierung genutzte
        // Locale nur via String.format.
        System.out.println(String.format(Locale.ROOT, "%s: %.2f", name, value));
    }

    public static void printMinimum(String name, int value) {
        System.out.println("%s: %s".formatted(name, value));
        System.out.println("Minimum von a, b und c ist ungerade: %s".formatted(!even(value)));
    }
}
