public class ChamomileFlower extends BaseFlower {
    private String name = "Chamomile";
    public ChamomileFlower(String color, int size) {
        super(color, size);
    }

    @Override
    public String getName() {
        return name;
    }
}
