package utils;

import java.util.Arrays;
import java.util.StringJoiner;

public final class CaesarPasswd {

    private static final int ALPHABET_LENGTH = 26;
    private static final int SPACE_SYMBOL = 32;
    private static final int BIG_A = 65;
    private static final int SMALL_A = 97;
    private static final int BIG_Z = 90;
    private static final int SMALL_Z = 122;


    public static String encode(String text, int key) {


        char[] textArray = text.toCharArray();


        for (int i = 0; i < textArray.length; i++) {
            char letter = textArray[i];

            if (letter == SPACE_SYMBOL) {
                continue;
            }

            if (letter >= SMALL_A && letter <= SMALL_Z) {
                textArray[i] = (char) (((letter - SMALL_A  + key) % ALPHABET_LENGTH) + SMALL_A);
            }

            if (letter >= BIG_A && letter <= BIG_Z) {
                textArray[i] = (char) (((letter - BIG_A + key ) % ALPHABET_LENGTH) + BIG_A);
            }


        }

        return String.valueOf(textArray);
    }

    public static String decode(String text, int key){
        key = ALPHABET_LENGTH - key;
        return encode(text, key);
    }

}
