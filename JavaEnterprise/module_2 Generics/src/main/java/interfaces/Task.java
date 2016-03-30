package interfaces;

public interface Task<T> {

    void execute();

    T getResult();

}
