import java.util.Scanner;

public class Bai33b {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int result = combination(n, k);

        System.out.println(result);
    }

    static int combination(int n, int k) {
        if (k == 0 || k == n) {
            return 1;
        }

        return combination(n - 1, k - 1) + combination(n - 1, k);
    }
}
