package Interface;

import Interface.src.OtherPerson;
import Interface.src.PYmili;

public class Main {
    public static void main(String[] args) {
        PYmili pymili = new PYmili();
        pymili.lazy();
        pymili.fantasy();
        OtherPerson otherPerson = new OtherPerson();
        System.out.println(otherPerson.toString());
    }
}
