import java.util.Scanner;

public class Task12 {
    /*Вывести на экран фигуру (елочка)*/
    public static void main(String args[]) {
        int size;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите высоту елки: ");
        size = sc.nextInt();
        for (int i = 0; i < size; i++) {
            for (int k = size - i; k >= 1; k--)
                System.out.print(" ");
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.print("\n");

        }

    }
}

