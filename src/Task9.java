import java.util.Scanner;

/* Ввести натуральное число и определить, верно ли, что сумма его цифр равна 10.
Пример:
Введите число >= 0:                         Введите число >= 0:
-234                                                1233
Нужно положительное число.                           Нет
Введите число >= 0:
1234
Да
*/
public class Task9 {
    public static void main(String[] args) {
        int i;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Введите число > 0 ");
            i = sc.nextInt();
            }
        while (i <= 0);

        int a = 0, x = i;
        while (i > 0) {
            a = a + (i % 10);
            i = i / 10;
        }
        if (a == 10) {
            System.out.println("Да! Сумма цифр числа "+x+" равна 10");
        }else {
            System.out.println("Нет! Сумма цифр числа "+x+" не равна 10");
        }
    }
}
