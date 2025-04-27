import java.util.Scanner;

public class Bai33h {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.print(isPalindrome(n, 0, n));
    }

    static boolean isPalindrome(int n, int reversed, int k) {
        if (n == 0) {
            return reversed == k;
        }
        int lastDigit = n % 10;
        reversed = reversed * 10 + lastDigit;
        return isPalindrome(n / 10, reversed, k);
    }
}