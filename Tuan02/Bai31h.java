import java.util.Scanner;

public class Bai31h {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double x = sc.nextDouble();

        double cosX = 1.0;
        double term = 1.0;

        for (int i = 1; i <= 2 * n; i++) {
            term *= (-x * x) / ((2 * i) * (2 * i - 1));
            cosX += term;
        }

        System.out.println("cos(" + x + ") = " + cosX);
    }
}
