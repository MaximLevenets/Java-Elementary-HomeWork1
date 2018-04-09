import java.util.Scanner;
/*Ввести натуральное число и определить, какие цифры встречаются несколько раз.
Пример:
Введите число >= 0:                             Введите число >= 0:
2323                                         1234
Повторяются: 2, 3                             Нет повторов.
*/
public class Task10 {
    public static void main(String[] args) {
        int inputValue, tempValue;
        Scanner sc = new Scanner(System.in);
        int count0 = 0, count1 = 0, count2 = 0,
            count3 = 0, count4 = 0, count5 = 0,
            count6 = 0, count7 = 0, count8 = 0, count9 = 0;
        System.out.println("Введите число:");
        while (true){
        inputValue = sc.nextInt();
        if (inputValue >= 0)
            break;
            else
                System.out.println("Неверно! Введите число > = 0 ");
        }
        for (; inputValue > 0; ){
                tempValue = inputValue % 10;
                inputValue /= 10;

                switch (tempValue){
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
            if (count0 < 2 &&
                    count1 < 2 &&
                    count2 < 2 &&
                    count3 < 2 &&
                    count4 < 2 &&
                    count5 < 2 &&
                    count6 < 2 &&
                    count7 < 2 &&
                    count8 < 2 &&
                    count9 < 2){
                System.out.println("Нет повторов");
            }
            else
                System.out.println("Повторяются: " +
                (count0 > 1 ? "0, " : "") +
                (count1 > 1 ? "1, " : "") +
                (count2 > 1 ? "2, " : "") +
                (count3 > 1 ? "3, " : "") +
                (count4 > 1 ? "4, " : "") +
                (count5 > 1 ? "5, " : "") +
                (count6 > 1 ? "6, " : "") +
                (count7 > 1 ? "7, " : "") +
                (count8 > 1 ? "8, " : "") +
                (count9 > 1 ? "9, " : "") + "\b\b.");
        }
    }

