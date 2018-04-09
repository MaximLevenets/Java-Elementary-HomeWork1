
import java.util.Scanner;
/*Дано натуральное число n.  Определить, является ли год с таким номером високосным.
(Год является високосным в двух случаях: либо он кратен 4, но при этом не кратен 100, либо кратен 400.
Год не является високосным, если он не кратен 4, либо он кратен 100, но при этом не кратен 400).
*/
public class Task1 {
    public static void main(String[] args) {
        int year;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Введите год(число должно быть положительным) ");
            year = sc.nextInt();
            }while (year <=0);
        if ((year%4==0&&year%100!=0)|year%400==0){
            System.out.println("Год высокостный!");
        }else {
            System.out.println("Год не выскостный!!!");
        }
        }
    }

