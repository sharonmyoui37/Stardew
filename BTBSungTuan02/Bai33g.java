import java.util.Scanner;

public class Bai33g {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.print(maxDigit(n));
    }

    static int maxDigit(int n) {
        if (n < 10) {
            return n;
        }
        int digit = n % 10;

        return Math.max(digit, maxDigit(n / 10));
    }
}