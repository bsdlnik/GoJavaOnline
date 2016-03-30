/**
 * Злиття Цифр
 * <p>
 * З'єднати масив символів в число.
 * Приклад:
 * Для [ '1', '2', '3'] повернути 123
 */

public class JoinCharacters {
    public int join(char[] input) {

        int result = 0;
        int digit = 0;

        for (int i = 0; i < input.length; i++) {
            digit = Character.getNumericValue(input[i]);
            result = result * 10 + digit;
        }

        return result;

    }
}
