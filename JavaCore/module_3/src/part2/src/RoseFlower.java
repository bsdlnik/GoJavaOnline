public class RoseFlower extends BaseFlower {
    private String name = "Rose";
    public RoseFlower(String color, int size) {
        super(color, size);
    }

    @Override
    public String getName() {
        return name;
    }
}
