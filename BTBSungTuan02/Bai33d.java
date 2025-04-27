import java.util.Scanner;

public class Bai33d {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int result = arrangement(n, k);

        System.out.println(result);
    }

    static int arrangement(int n, int k) {
        if (k == 0) {
            return 1;
        }

        return n * arrangement(n - 1, k - 1);
    }
}
