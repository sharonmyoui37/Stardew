import java.util.Scanner;

class Bai41b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Double[] arr = new Double[n];
        arr[0] = sc.nextDouble();
        double max = arr[0];

        for (int i = 1; i < n; i++) {
            arr[i] = sc.nextDouble();
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.print(max);
    }
}