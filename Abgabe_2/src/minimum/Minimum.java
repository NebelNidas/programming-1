package minimum;

public class Minimum {
    public static void main(String[] args) {
        int x = 100;
        int y = 200;
        int z = -20;
        int min;

        min = x < y ? x : y;
        min = z < min ? z : min;

        System.out.println("x ist " + x);
        System.out.println("y ist " + y);
        System.out.println("z ist " + z);
        System.out.println("Das Minimum ist " + min);
    }

}
