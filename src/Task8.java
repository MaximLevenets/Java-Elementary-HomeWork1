import java.util.Scanner;
/*Ввести целое число и определить, верно ли, что в его записи есть две одинаковые цифры.
Пример:
Введите целое число: Введите целое число:
1234                     1224
Нет.                     Да.
*/
public class Task8 {
    public static void main(String[] args) {
        int inputValue, tempValue;
        Scanner sc = new Scanner(System.in);
        int count0 = 0, count1 = 0, count2 = 0, count3 = 0, count4 = 0, count5 = 0, count6 = 0, count7 = 0, count8 = 0, count9 = 0;
        System.out.println("Введите число:");
        while (true) {
            inputValue = sc.nextInt();
            if (inputValue >= 0)
                break;
            else System.out.println("Неверно! Введите число > = 0 ");
        }
        for (; inputValue > 0; ) {
            tempValue = inputValue % 10;
            inputValue /= 10;

            switch (tempValue) {
                case 0:
                    count0++;
                    break;
                case 1:
                    count1++;
                    break;
                case 2:
                    count2++;
                    break;
                case 3:
                    count3++;
                    break;
                case 4:
                    count4++;
                    break;
                case 5:
                    count5++;
                    break;
                case 6:
                    count6++;
                    break;
                case 7:
                    count7++;
                    break;
                case 8:
                    count8++;
                    break;
                case 9:
                    count9++;
                    break;
            }
        }
        if (count0 > 1 ||
                count1 > 1 ||
                count2 > 1 ||
                count3 > 1 ||
                count4 > 1 ||
                count5 > 1 ||
                count6 > 1 ||
                count7 > 1 ||
                count8 > 1 ||
                count9 > 1){
            System.out.println("Да, цифры повторяються!");
        }
        else System.out.println("Нет, цифры не повторяються!");
    }
}
