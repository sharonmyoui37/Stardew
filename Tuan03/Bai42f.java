import java.util.Scanner;

public class Bai42f {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        boolean isIdentity = true;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j && matrix[i][j] != 1) {
                    isIdentity = false;
                    break;
                } else if (i != j && matrix[i][j] != 0) {
                    isIdentity = false;
                    break;
                }
            }
        }

        System.out.println(isIdentity);
    }
}
