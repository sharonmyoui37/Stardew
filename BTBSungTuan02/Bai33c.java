import java.util.Scanner;

public class Bai33c {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int result = permutation(n);

        System.out.println(result);
    }

    static int permutation(int n) {
        if (n == 1) {
            return 1;
        }

        return n * permutation(n - 1);
    }
}
