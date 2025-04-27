import java.util.Scanner;

class Bai32e {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int count = 0;
        int i = 1;

        while (i <= n) {
            int temp = i;
            int sum = 0;
            while (temp > 0) {
                sum += (temp % 10);
                temp = temp / 10;
            }
            if (i % sum == 0) {
                count++;
            }
            i++;
        }

        System.out.print(count);
    }
}