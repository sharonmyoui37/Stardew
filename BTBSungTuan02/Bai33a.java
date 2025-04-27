import java.util.Scanner;

public class Bai33a {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String octalNumber = decToOctal(n);

        System.out.println("Số " + n + " trong hệ bát phân là: " + octalNumber);
    }

    private static String decToOctal(int n) {
        if (n == 0) {
            return "";
        }

        int remainder = n % 8;
        String digit = String.valueOf(remainder);

        return decToOctal(n / 8) + digit;
    }
}
