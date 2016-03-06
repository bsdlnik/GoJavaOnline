package flowers;

import exceptions.SizeOfFlowerException;

public class ChamomileFlower extends BaseFlower {
    private String name = "Chamomile";
    public ChamomileFlower(String color, int size) throws SizeOfFlowerException {
        super(color, size);
    }

    @Override
    public String getName() {
        return name;
    }
}
