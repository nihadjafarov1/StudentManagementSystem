package service.menu.inter;

public interface Process {
    public abstract void processLogic();
    public default void process() {
        processLogic();
    }
}
