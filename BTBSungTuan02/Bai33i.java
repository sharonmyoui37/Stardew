import java.util.Scanner;

public class Bai33h {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        System.out.print(reversedString(s));
    }

    static string reversedString(String s) {
        if (s.length == 1) {
            return s;
        }
        return (s.charAt(s.length - 1) + reversedString(s.substring(0, s.length - 1)));
    }
}