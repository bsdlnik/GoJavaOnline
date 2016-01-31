import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class DataInput {

    public static int  readLineInt()  throws InputMismatchException{
        Scanner scanner = new Scanner(System.in);
        int result = 0;
        result = scanner.nextInt();

        return result;
    }

    public  static String readLineBin(){
        Scanner scanner = new Scanner(System.in);
        String result = scanner.next();

        return result;
    }
}
