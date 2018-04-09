
import java.util.Scanner;
/* Ввести возраст человека (от 1 до 150 лет) и вывести его вместе с последующим словом «год», «года» или «лет».
Пример:
Введите возраст: 24
Вам 24 года
Введите возраст: 57
Вам 57 лет
*/
public class Task4 {
    public static void main(String[] args) {
        int years, year;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Введите возраст от 1 до 150 лет: ");
            years = sc.nextInt();
        } while (years < 0 || years > 150);

        if ((years % 100) >= 11 && (years % 100) <= 14){
            System.out.println("Вам" + " " + years + " " + "лет");
        }
        else
            switch (years % 10){
                case 1:
                    System.out.println("Вам" + " " + years + " " + "год");
                    break;
                case 2:
                case 3:
                case 4:
                    System.out.println("Вам" + " " + years + " " + "года");
                    break;
                case 0:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                    System.out.println("Вам" + " " + years + " " + "лет");
                    break;
            }
        }
    }

