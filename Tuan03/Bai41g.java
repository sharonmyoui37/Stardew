import java.util.Scanner;

public class Bai41g {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // Số lượng tên

        String[] names = new String[n];
        for (int i = 0; i < n; i++) {
            names[i] = scanner.nextLine();
        }
        // Sắp xếp tên
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (names[i].compareToIgnoreCase(names[j]) > 0) {
                    String temp = names[i];
                    names[i] = names[j];
                    names[j] = temp;
                }
            }
        }

        // Chuẩn hóa tên
        for (int i = 0; i < n; i++) {
            String[] nameParts = names[i].split(" ");
            for (int j = 0; j < nameParts.length; j++) {
                nameParts[j] = nameParts[j].substring(0, 1).toUpperCase() + nameParts[j].substring(1).toLowerCase();
            }
            names[i] = String.join(" ", nameParts);
        }

        for (String name : names) {
            System.out.println(name);
        }
    }
}
