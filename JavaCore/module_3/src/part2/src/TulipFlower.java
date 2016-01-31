public class TulipFlower extends BaseFlower {
    private String name = "Tulip";
    public TulipFlower(String color, int size) {
        super(color, size);
    }

    @Override
    public String getName() {
        return name;
    }
}
