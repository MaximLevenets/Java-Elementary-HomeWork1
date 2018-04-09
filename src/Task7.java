import java.util.Scanner;

/* Ввести целое число и найти сумму его цифр.
Пример:
Введите целое число:
1234
Сумма цифр числа 1234 равна 10.
*/
public class Task7 {
    public static void main(String[] args) {
        int i, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: ");
        i = sc.nextInt();
        int x = i;
        while (i > 0){
            sum = sum + (i % 10);
            i = i / 10;
        }
        System.out.println("Сумма цифр числа " + x + " равна " + sum);

    }
}
