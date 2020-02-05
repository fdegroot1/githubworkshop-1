package avans;

public class Main {

    public static void main(String[] args) {
        System.out.println("Test my methods:");

        double a = 12.5;
        double b = 88.8;
        double r1 = sum(a, b);
        System.out.println(a + " + " + b + " = " + r1);

        double r2 = multiply(a, b);
        System.out.println(a + " * " + b + " = " + r2);

    }

    public static double sum (double a, double b) {
        return a + b;
    }

    public static double multiply (double a, double b) {
        return a * b;
    }
}
