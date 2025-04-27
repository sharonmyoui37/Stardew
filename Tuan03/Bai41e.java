import java.util.Scanner;

class Bai41e {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print(isIncrease(arr));
    }

    public static boolean isIncrease(int a[]) {
        if (a.length == 1) {
            return true;
        }
        for (int i = 1; i < a.length; i++) {
            if (a[i] <= a[i - 1]) {
                return false;
            }
        }
        return true;
    }
}