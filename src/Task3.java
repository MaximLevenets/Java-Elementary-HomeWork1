package Branching;

import java.util.Scanner;
/*Ввести номер месяца и вывести название времени года.
Пример:
Введите номер месяца: 4
Время года - весна
*/
public class Task3 {
    public static void main(String[] args) {
        int month;
        String season = null;
        System.out.println("Введите номер месяца:");
        Scanner sc = new Scanner(System.in);
        month = sc.nextInt();
        switch (month){
            case 12:
            case 1:
            case 2:
                season = "Зима";
                break;
            case 3:
            case 4:
            case 5:
                season = "Весна";
                break;
            case 6:
            case 7:
            case 8:
                season = "Лето";
                break;
            case 9:
            case 10:
            case 11:
                season = "Осень";
                break;
        }
        if (month > 0){
            System.out.println("Время года - "+season);
        }else
            System.out.println("Такого времени года не существует!!!");
    }
}
