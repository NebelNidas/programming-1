package fibonacci;

public class Fibinacci {
    public static void main(String[] args) {
        int n = 21;

        System.out.println(fibonacci(n));
    }

    static int fibonacci(int n) {
        if (n == 1) {
            return 1;
        }

        return fibonacci(n-1);
    }
}
