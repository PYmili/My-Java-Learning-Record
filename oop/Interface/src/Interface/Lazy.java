package Interface.src.Interface;

public interface Lazy {
    public abstract void lazy();
    public default void fantasy() {
        init();
        System.out.println("Fantasy in progress ...");
    }
    public static void reward() {
        init();
        System.out.println("Reward yourself ...");
    }
    private static void init() {
        System.out.println("Init ...");
    }
}
