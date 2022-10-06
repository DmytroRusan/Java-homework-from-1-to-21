package Task12;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть число k");
        int k = scanner.nextInt();
        System.out.println("Введіть число n");
        int n = scanner.nextInt();

        if (k < n) {
            for (int i = k + 1; i < n; i++) {
                System.out.print(i + " ");
            }
        } else if (k > n) {
            for (int i = k-1; i > n; i--) {
                System.out.print(i + " ");
            }
        }
    }
}
