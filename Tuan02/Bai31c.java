import java.util.Scanner;

class Bai31c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int status = 1;
        int num = 3;
        if (n >= 1) {
            System.out.print(2 + " ");
        }

        for (int i = 2; i <= n;) {
            for (int j = 2; j <= Math.sqrt(num); j++) {
                if (num % j == 0) {
                    status = 0;
                    break;
                }
            }
            if (status != 0) {
                System.out.print(num + " ");
                i++;
            }
            status = 1;
            num++;
        }
    }
}