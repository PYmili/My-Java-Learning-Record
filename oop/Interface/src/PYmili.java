package Interface.src;

import Interface.src.Interface.Lazy;

public class PYmili extends Person implements Lazy {
    public PYmili() {
        super("PYmili", 19);
    }
    @Override
    public void lazy() {
        System.out.println("PYmili is very lazy.");
    }
}
