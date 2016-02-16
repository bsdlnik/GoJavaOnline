package combinationOfFlowers;

import flowers.RoseFlower;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class RoseBush {
    private String name;
    private List<RoseFlower> flower = new ArrayList<RoseFlower>();

    public RoseBush(String name, RoseFlower... flowersNames) {
        this.name = name;
        for (RoseFlower f : flowersNames) {
            this.flower.add(f);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // вырываем случайный цветок
    public RoseFlower takeFlower() {
        RoseFlower tmpFlowerLink = null;
        int i = (int) (Math.random() * (flower.size()));
        tmpFlowerLink = flower.get(i);
        flower.remove(i);
        return tmpFlowerLink;
    }

    private StringBuilder getFlowersInfo() {
        StringBuilder stringBuilder = new StringBuilder();
        for (RoseFlower f : flower)
            stringBuilder.append("      -").append(f).append("\n");
        return stringBuilder;
    }

    @Override
    public String toString() {
        return new StringBuilder().append("Name of Bush: ").append(getName()).append("\n").append(getFlowersInfo()).toString();
    }


}
