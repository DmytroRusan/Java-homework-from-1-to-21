package Task4;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть суму товару: ");
        double price = scanner.nextDouble();
        System.out.println("Введіть суму Ваших грошей: ");
        double myMoney = scanner.nextDouble();
        int goods = 0;
        if (myMoney < price) {
            System.out.println("У Вас менше грошей, ніж коштує товар");
        } else {
            goods = (int) (myMoney / price);
            System.out.println("Кількість товару, який можна купити: " + goods);
            double result = myMoney - price * goods;
            System.out.println("Ваша здача: " + (int) (result * 100) /100.0);
        }
    }
}
