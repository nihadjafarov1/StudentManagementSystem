package service.menu.inter;

public interface Process {
    void processLogic();
    public default void process() {
        processLogic();
    }
}
