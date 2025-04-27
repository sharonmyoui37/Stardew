import java.util.Scanner;

public class Bai33f {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int result = count(n);

        System.out.println(result);
    }

    static int count(int n) {
        if (n == 0) {
            return 0;
        }

        return 1 + count(n / 10);
    }
}