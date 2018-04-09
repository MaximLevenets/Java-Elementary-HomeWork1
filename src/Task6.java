public class Task6 {
    /*Вывести сумму всех четных чисел от 100 до 450*/
    public static void main(String[] args) {
        int min = 100, max = 450, sum = 0;
        for (int i = min; i <= max; i++) {
            if (i % 2 == 0) {
                sum = sum + i;
            }
        }
        System.out.println("Cумма всех четных чисел в дипазоне от 100 до 450 = "+sum);
    }
}


