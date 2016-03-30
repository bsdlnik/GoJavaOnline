/**
 * Сума Цифр
 * <p>
 * Обчислити суму цифр числа.
 * Наприклад сума цифр числа 123 дорівнює  6.
 */

public class SumDigits {
    public int sum(int number) {

        int sum = 0;

        while (number != 0){
            sum += number % 10;
            number = number / 10;
        }

        return Math.abs(sum);

    }
}
