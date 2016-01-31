public abstract class BaseMusicInstrument {
    private String name = "unknown instrument";

    public BaseMusicInstrument() {

    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Instrument type: " + getName() ;
    }
}
