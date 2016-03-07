package combinationOfFlowers;

import exceptions.QuantityOfFlowersException;
import flowers.BaseFlower;
import flowers.RoseFlower;
import utils.Print;

import java.util.ArrayList;
import java.util.List;

public class BouquetOfFlowers {
    private String name;
    private List<BaseFlower> flower = new ArrayList<>();

    public BouquetOfFlowers(String name, BaseFlower... flowersNames) {

        try {

            if (flowersNames.length < 3) {
                throw new QuantityOfFlowersException(flowersNames.length);
            }
            this.name = name;

            for (BaseFlower f : flowersNames) {
                this.flower.add(f);
            }

        } catch (QuantityOfFlowersException e) {

        }


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addFlower(BaseFlower... flowersNames) {

        for (BaseFlower f : flowersNames) {
            this.flower.add(f);
        }
    }

    public BaseFlower takeFlower(String flowerName) throws QuantityOfFlowersException {
        BaseFlower tmpFlowerLink = null;
        if (flower.size() > 3) {
            for (int i = 0; i < flower.size(); i++) {
                if (flower.get(i).getName().contains(flowerName)) {
                    tmpFlowerLink = flower.get(i);
                    flower.remove(i);
                }
            }
        } else {
           /* System.out.println("___Error. There are must be more than 3 flowers in bouquet. Flower " + flowerName + " can't be move from bouquet. \n");*/
            throw new QuantityOfFlowersException(flower.size());
        }
        return tmpFlowerLink;
    }

    private StringBuilder flowersInfo() {
        StringBuilder stringBuilder = new StringBuilder();
        for (BaseFlower f : flower)
            stringBuilder.append("      -").append(f).append("\n");
        return stringBuilder;
    }


    public String toString() {
        return new StringBuilder().append("Name of Bouquet: ").append(getName()).append("\n").append(flowersInfo()).toString();
    }

    public void printInfo() {
        Print.nameSort(flower);
        System.out.println();
        Print.printStream(flower);
    }
}
