public class AsterFlower extends BaseFlower{
    private String name = "Aster";

    public AsterFlower(String color, int size) {
        super(color, size);
    }

    @Override
    public String getName() {
        return name;
    }
}
