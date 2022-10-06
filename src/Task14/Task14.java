package Task14;

import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть k");
        int k = scanner.nextInt();
        String star = "*";
        for (int i = 0; i < k; i++) {
            System.out.println(star);
            star += "*";
        }
    }
}
