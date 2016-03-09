package flowers;

import exceptions.SizeOfFlowerException;

public class RoseFlower extends BaseFlower {
    private String name = "Rose";
    public RoseFlower(String color, int size) throws SizeOfFlowerException {
        super(color, size);
    }

    @Override
    public String getName() {
        return name;
    }
}
