import combinationOfFlowers.BouquetOfFlowers;
import exceptions.QuantityOfFlowersException;
import exceptions.SizeOfFlowerException;
import flowers.RoseFlower;
import utils.SelectMenu;

public class Main {

    public static void main(String[] args) throws QuantityOfFlowersException {


        BouquetOfFlowers bouquet = null;
        try {
            bouquet = new BouquetOfFlowers("For lovely girl", new RoseFlower("Red", 3), new RoseFlower("Red", 3), new RoseFlower("Red", 3), new RoseFlower("Red", 3));
        } catch (SizeOfFlowerException e) {
            System.out.println("new bouquet with negative size");
        }

        try {
            bouquet.addFlower(new RoseFlower("Red", 5), new RoseFlower("Red", 5));
        } catch (NullPointerException e) {
            System.out.println("There no instance of bouquet ");
        } catch (SizeOfFlowerException e) {
            System.out.println("addFlower with negative size");
        }

        System.out.println(bouquet);

    }

}
