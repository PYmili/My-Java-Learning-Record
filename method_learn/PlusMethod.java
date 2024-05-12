package method_learn;

public class PlusMethod {
    public static int plus(int x, int y) {
        return x + y;
    }
    public static double plus(double x, double y) {
        return x + y;
    }
    public static float plus(float x, float y) {
        return x + y;
    }
    public static int plus(int x, double y) {
        return (int)(x + y);
    }
    public static double plus(double x, int y) {
        return (double)(x + y);
    }
}
