import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class BouquetOfFlowers {
    private String name;
    private List<BaseFlower> flower = new ArrayList<>();

    public BouquetOfFlowers(String name, BaseFlower... flowersNames) {
        this.name = name;
        for (BaseFlower f : flowersNames) {
            this.flower.add(f);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFlowers(BaseFlower... flowersNames) {
        for (BaseFlower f : flowersNames) {
            this.flower.add(f);
        }


    }

    public BaseFlower getFlower(String flowerName) {
        BaseFlower tmpFlowerLink = null;
        if(flower.size() > 3 ){
            for (int i = 0; i < flower.size(); i++) {
                if (flower.get(i).getName().contains(flowerName)){
                    tmpFlowerLink =  flower.get(i);
                    flower.remove(i);
                }
            }
        }else {
            System.out.println("___Error. There are must be more than 3 flowers in bouquet. Flower " + flowerName + " can't be move from bouquet. \n");
        }
        return tmpFlowerLink;
    }

    private StringBuilder getFlowersInfo(){
        Collection<BaseFlower> flowerInfo = flower;
        Iterator<BaseFlower>  iter = flowerInfo.iterator();
        StringBuilder stringBuilder = new StringBuilder();
        while(iter.hasNext()){
            stringBuilder.append("      -").append(iter.next()).append("\n");
        }
        return stringBuilder;
    }


    public String toString() {
        return new  StringBuilder().append("Name of Bouquet: ").append(getName()).append("\n").append(getFlowersInfo()).toString();
    }
}
