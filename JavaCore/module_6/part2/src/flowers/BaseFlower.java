package flowers;

import exceptions.SizeOfFlowerException;

public abstract class BaseFlower {

    private String color;
    private int size;
    private String name = "unknown flower";

    public BaseFlower(String color, int size) throws SizeOfFlowerException {
            if (size <= 0){
                throw new SizeOfFlowerException();
            }
            this.color = color;
            this.size = size;

    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Flower type: " + getName() +  ",       color: " + getColor() + ", size: " + getSize() ;
    }


}
