import java.util.Scanner;

public class Bai31f {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double x = sc.nextDouble();

        double result = calculateSin(x, n);
        System.out.println("sin(" + x + ") = " + result);
    }

    public static double calculateSin(double x, int n) {
        double sinX = 0;
        for (int i = 0; i <= (2 * n + 1); i++) {
            double term = Math.pow(-1, i) * Math.pow(x, 2 * i + 1) / factorial(2 * i + 1);
            sinX += term;
        }
        return sinX;
    }

    public static double factorial(int num) {
        double result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        return result;
    }
}
