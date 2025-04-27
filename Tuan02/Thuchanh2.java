import java.util.Scanner;

class Thuchanh2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Double[][] arr1 = new Double[n][n];
        Double[][] arr2 = new Double[n][n];
        Double[][] arr3 = new Double[n][n];
        inputMatrix(arr1, n, sc);
        inputMatrix(arr2, n, sc);
    }

    public static void inputMatrix(double[][] arr, int n, Scanner sc) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextDouble();
            }
        }
    }

    public static void sum(Double[][] arr1, Double[][] arr2, Double[][] arr3) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr3[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
    }
}