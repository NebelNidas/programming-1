package triangle;

public class Triangle {
    public static void main(String[] args) {
        double a = 5;
        double b = 5;
        double c = 7.071;
        boolean rightAngledTriangle = Math.abs(a*a + b*b - c*c) < 0.1;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);

        String message;

        if (rightAngledTriangle) {
            message = "Das Dreieck ist rechtwinklig.";
        } else {
            message = "Das Dreieck ist nicht rechtwinklig.";
        }

        System.out.println(message);
    }
}
