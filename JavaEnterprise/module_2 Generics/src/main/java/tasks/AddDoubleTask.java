package tasks;

import interfaces.Task;

public class AddDoubleTask implements Task<Double>{
    private double a;
    private double b;
    private Double result;

    public AddDoubleTask(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public void execute(){
        result = a + b;
    }

    @Override
    public Double getResult(){
        return result;
    }
}
