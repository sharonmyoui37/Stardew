import java.util.Scanner;

class Bai32b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int r = sc.nextInt();

        int i = l;
        int count = 0;
        while (i <= r) {
            int j = 2;
            while (j * j <= i) {
                if (i % j == 0) {
                    count--;
                    break;
                }
                j++;
            }
            count++;
            i++;
        }

        System.out.print(count);
    }
}