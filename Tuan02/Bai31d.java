import java.util.Scanner;

class Bai31d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int a = 1;
        int b = 0;
        int temp;

        for (int i = n; i > 0; i--) {
            temp = a;
            a = a + b;
            b = temp;
        }

        System.out.print(b);
    }
}