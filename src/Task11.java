import java.util.Scanner;

/*Пользователь с клавиатуры последовательно вводит целые числа. Как только пользователь
ввел 0, необходимо показать на экран сумму всех введенных чисел.
*/
public class Task11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, sum = 0;
        do {
            System.out.println("Введите число: ");
            i = sc.nextInt();
            sum += i;
        }
        while (i != 0);
        System.out.println("Сумма всех введенных чисел равна " + sum);
    }
}
