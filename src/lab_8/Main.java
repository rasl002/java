package lab_8;

import java.util.Scanner;

public class Main {
    static int recursionShow(int n, int max) {
        if (n == max + 1) {
            return 0;
        }
        System.out.println(n);
        return Main.recursionShow(n + 1, max);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String num = scanner.nextLine();
        Main.recursionShow(1, Integer.parseInt(num, 10));
    }
}
