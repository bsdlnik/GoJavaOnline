
public class BinaryUtils {

    private static int bitsInNumberShift(int decimalNumber) {
        int numberOfBits = 0;
        while (decimalNumber > 0) {
            decimalNumber >>= 1;
            numberOfBits++;
        }
        return numberOfBits;
    }

    private static int bitsInNumberLog(int decimalNumber){
        return (int)(Math.log(decimalNumber) / Math.log(2) + 1);
    }

    public static String decimalToBinaryOne(int decimalNumber){
        StringBuilder stringBuilder = new StringBuilder();
        int exponentOfTwo = 1;
        for(int i = 0; i < bitsInNumberLog(decimalNumber); i ++) {
            stringBuilder.append((decimalNumber & exponentOfTwo) == 0 ? "0" : "1");
            exponentOfTwo <<= 1;
        }
        stringBuilder.reverse();
        String result = stringBuilder.toString();
        return result;
    }

    public static String decimalToBinaryTwo(int decimalNumber) {
        StringBuilder stringBuilder = new StringBuilder();
        int i = bitsInNumberShift(decimalNumber);
        while ( --i >= 0 ){
            stringBuilder.append((decimalNumber & (1 << i)) == 0 ? "0" : "1");
        }
        String result = stringBuilder.toString();
        return result;
    }

    public static String decimalToBinaryThree(int decimalNumber) {
        StringBuilder stringBuilder = new StringBuilder();
        int tmp;
        while (decimalNumber != 0) {
            tmp = decimalNumber % 2;
            stringBuilder.append(tmp);
            decimalNumber = decimalNumber / 2;
        }
        stringBuilder.reverse();
        String result = stringBuilder.toString();
        return result;
    }

    public static int binaryToDecimal(String binaryNumber){
        String reverseBinaryNumber = new StringBuilder(binaryNumber).reverse().toString();
        int result = 0;
        for(int i = binaryNumber.length() - 1; i >= 0 ; i--){

            result += (1 << i ) * (reverseBinaryNumber.charAt(i) == '1' ? 1 : 0);
        }
        return result;
    }


}
