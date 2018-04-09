package Branching;

import java.util.Scanner;
/*Создать калькулятор:
Пользователь вводит 1-ое число, потом 2-ое число, а потом операцию, которую хочет выполнить (+ - * / ).
Калькулятор выдает результат.
Пример:
Введите число a: 23
Введите число b: 35
    Введите операцию (+ - * / ): +
Ответ: 58
*/
public class Task5 {
    public static void main(String[] args) {
        char operation;
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        a = sc.nextInt();
        System.out.println("Введите второе число: ");
        b = sc.nextInt();
        System.out.println("Введите операцию (+ - * /)");
        operation = sc.next().charAt(0);
        switch (operation){
            case '+':
                System.out.println("Результат операции сложения: " + (a + b));
                break;
            case '-':
                System.out.println("Результат операции вычитания: " + (a - b));
                break;
            case '*':
                System.out.println("Результат операции умножения: " + (a * b));
                break;
            case '/':
                System.out.println("Результат операции деления: " + (a / b));
                break;
        }

    }
}
