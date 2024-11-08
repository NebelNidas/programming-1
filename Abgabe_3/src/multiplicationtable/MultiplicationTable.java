package multiplicationtable;

public class MultiplicationTable {
    public static void main(String[] args) {
        int startValue = 1;
        int endValue = 9;

        System.out.println("Von: " + startValue + " * " + startValue + " = " + startValue*startValue);
        System.out.println("Bis: " + endValue + " * " + endValue + " = " + endValue*endValue);
        System.out.println();

        for (int line = startValue; line <= endValue; line++) {
            for (int column = startValue; column <= endValue; column++) {
                System.out.print(line * column + "\t");
            }

            System.out.println();
        }
    }
}
