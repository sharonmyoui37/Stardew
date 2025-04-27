import java.util.Scanner;

class Thuchanh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[][] arr = new double[n][n];
        double arr1 = nhapMang(arr);
        double max = Max(arr1);
        System.out.print(max);
    }

    public static double nhapMang(double[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = sc.nextDouble();
            }
        }
    }

    public static double Max(double[][] arr) {
        double max = a[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (a[i][j] > max) {
                    max = a[i][j];
                }
            }
        }
        return max;
    }
}