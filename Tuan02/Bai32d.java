import java.util.Scanner;

class Bai32d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int temp = n;
        int sum = 0;
        while (temp > 0) {
            sum += (temp % 10);
            temp = temp / 10;
        }

        System.out.print(n % sum == 0);
    }
}