import java.util.Scanner;

class Bai32c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = -1;
        do {
            n = sc.nextInt();
        } while (n < 0 | n > 100);
    }
}