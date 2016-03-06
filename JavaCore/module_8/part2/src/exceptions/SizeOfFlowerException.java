package exceptions;

public class SizeOfFlowerException extends Exception {

    public SizeOfFlowerException() {
        System.out.println("Size can't be negative or 0");
    }
}
