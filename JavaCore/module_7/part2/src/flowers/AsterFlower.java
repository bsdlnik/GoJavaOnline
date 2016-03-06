package flowers;

import exceptions.SizeOfFlowerException;

public class AsterFlower extends BaseFlower{
    private String name = "Aster";

    public AsterFlower(String color, int size) throws SizeOfFlowerException {
        super(color, size);
    }

    @Override
    public String getName() {
        return name;
    }
}
