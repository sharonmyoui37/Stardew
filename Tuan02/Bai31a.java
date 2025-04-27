import java.util.Scanner;

class Bai31a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        double m = (double) (Math.sqrt(n));
        boolean b = true;

        for (int i = 2; i <= m; i++) {
            if (n % i == 0) {
                b = false;
                break;
            }
        }

        System.out.print(b);
    }
}