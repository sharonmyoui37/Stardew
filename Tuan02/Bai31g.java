import java.util.Scanner;

class Bai31g {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double x = sc.nextDouble();

        double exponentialX = 1;
        double term = 1;

        for (int i = 1; i <= n; i++) {
            term *= x / i;
            exponentialX += term;
        }
        System.out.println("e^(" + x + ") = " + exponentialX);
    }
}
