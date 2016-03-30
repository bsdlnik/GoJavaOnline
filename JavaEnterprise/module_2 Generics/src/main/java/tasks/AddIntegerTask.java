package tasks;

import interfaces.Task;

public class AddIntegerTask implements Task<Integer>{
    private int a;
    private int b;
    private Integer result;

    public AddIntegerTask(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public void execute(){
        result = a + b;
    }

    @Override
    public Integer getResult(){
        return result;
    }
}
