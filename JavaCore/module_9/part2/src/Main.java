import com.sun.org.apache.xpath.internal.SourceTree;
import combinationOfFlowers.BouquetOfFlowers;
import exceptions.QuantityOfFlowersException;
import exceptions.SizeOfFlowerException;
import flowers.RoseFlower;
import utils.CaesarPasswd;
import utils.Print;
import utils.SelectMenu;

import java.net.CacheRequest;

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

        System.out.println(CaesarPasswd.encode(bouquet.toString(), 7));
        System.out.println(CaesarPasswd.encode (CaesarPasswd.decode(bouquet.toString(), 7), 7));

        // - Test passwd
        // B Ifmmp xpsme!
        String text = "A Hello world!";
        System.out.println(CaesarPasswd.encode(text, 1));
        System.out.println(CaesarPasswd.decode(CaesarPasswd.encode(text, 1), 1));
        System.out.println(CaesarPasswd.decode("B Ifmmp xpsme!", 1));



    }

}
