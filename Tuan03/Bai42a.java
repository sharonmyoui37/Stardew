import java.util.Scanner;

class Bai42a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // Số hàng
        int m = sc.nextInt(); // Số cột
        Double[][] arr = new Double[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextDouble();
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.println();
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
        }
    }
}