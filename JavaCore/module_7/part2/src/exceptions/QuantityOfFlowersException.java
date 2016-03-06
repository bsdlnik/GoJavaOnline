package exceptions;

public class QuantityOfFlowersException extends Exception {

    // Refactoring


    public QuantityOfFlowersException(int quantityOfFlowers) {

        if (quantityOfFlowers < 3) {
            System.out.println("Error! You added " + quantityOfFlowers + " but bouquet can't be formed of less than then 3 flowers");
        }


    }

    public QuantityOfFlowersException() {
        System.out.println("Error!Bouquet can't be with 0 flowers");
    }
}
