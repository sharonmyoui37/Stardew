import java.util.Scanner;

public class Bai42c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        double[][] matrix = new double[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextDouble();
            }
        }

        double[] columnSum = new double[m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                columnSum[i] += matrix[j][i];
            }
        }

        int index = -1;
        double secondMaxSum = Double.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (columnSum[i] > secondMaxSum) {
                if (index != -1) {
                    secondMaxSum = columnSum[index];
                }
                index = i;
                secondMaxSum = columnSum[i];
            }
        }

        System.out.println(index);
    }
}
