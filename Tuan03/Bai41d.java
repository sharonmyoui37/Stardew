import java.util.Scanner;

class Bai41d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt(); // Số nhỏ thứ k
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int min = Integer.MIN_VALUE;
        int temp;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (arr[j] < arr[i]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        int count = 1;
        if (k >= 1 && k <= n) {
            min = arr[0];
            for (int j = 1; j < n; j++) {
                if (count == k) {
                    break;
                }
                if (arr[j] != arr[j - 1]) {
                    min = arr[j];
                    count++;
                }
            }
        }
        if (min > Integer.MIN_VALUE && count == k) {
            System.out.print(min);
        } else {
            System.out.print("Khong co");
        }
    }
}