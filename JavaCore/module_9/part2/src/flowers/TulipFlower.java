package flowers;

import exceptions.SizeOfFlowerException;

public class TulipFlower extends BaseFlower {
    private String name = "Tulip";
    public TulipFlower(String color, int size) throws SizeOfFlowerException {
        super(color, size);
    }

    @Override
    public String getName() {
        return name;
    }
}
