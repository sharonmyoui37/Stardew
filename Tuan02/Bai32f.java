import java.util.Scanner;

class Bai32f {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int num = 1;
        int count = 0;

        while (count < n) {
            int temp = num;
            int sum = 0;

            while (temp > 0) {
                if (temp % 2 == 0) {
                    sum = 0;
                    break;
                }
                sum += (temp % 10);
                temp = temp / 10;
            }

            if (sum % 2 != 0) {
                System.out.print(num + " ");
                count++;
            }
            num++;
        }

    }
}