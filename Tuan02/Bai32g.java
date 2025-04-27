import java.util.Scanner;

public class Bai32g {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double x = sc.nextDouble();

        double result = 0;

        double term = x;
        int n = 1;

        while (Math.abs(term) > 1e-6) {
            result += term;
            term *= -x * n / (n + 1);
            n++;
        }

        System.out.println("ln(1 + " + x + ") = " + result);
    }
}
