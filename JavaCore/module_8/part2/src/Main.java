import combinationOfFlowers.BouquetOfFlowers;
import exceptions.QuantityOfFlowersException;
import exceptions.SizeOfFlowerException;
import flowers.RoseFlower;
import utils.Print;
import utils.SelectMenu;

public class Main {

    public static void main(String[] args) throws QuantityOfFlowersException {


        BouquetOfFlowers bouquet = null;
        try {
            bouquet = new BouquetOfFlowers("For lovely girl", new RoseFlower("Red", 3), new RoseFlower("Yellow", 2), new RoseFlower("Black", 4), new RoseFlower("Brown", 1));
        } catch (SizeOfFlowerException e) {
            System.out.println("new bouquet with negative size");
        }

        try {
            bouquet.addFlower(new RoseFlower("Blue", 5), new RoseFlower("Pink", 7));
        } catch (NullPointerException e) {
            System.out.println("There no instance of bouquet ");
        } catch (SizeOfFlowerException e) {
            System.out.println("addFlower with negative size");
        }

        System.out.println(bouquet);
        System.out.println();



        bouquet.printInfo();

    }

}
