package Branching;

import java.util.Scanner;
/*Определить является ли число a делителем числа b и c одновременно (делится без остатка).*/
public class Task2 {
    public static void main(String[] args) {
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число а: ");
        a = sc.nextInt();
        System.out.println("Введите число b: ");
        b = sc.nextInt();
        System.out.println("Введите число c: ");
        c = sc.nextInt();
        if (b % a == 0 && c % a == 0){
            System.out.println("Число \"а\" являеться делителем чисел \"b\" и \"с\"");
        }else
            System.out.println("Число \"а\" не являеться делителем чисел \"b\" и \"с\"");
    }
}
