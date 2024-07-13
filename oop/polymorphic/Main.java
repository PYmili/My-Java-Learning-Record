package polymorphic;

import polymorphic.src.Administration;
import polymorphic.src.OrdinaryUser;
import polymorphic.src.User;

public class Main {
    public static void main(String[] args) {
        // success
        User ordinaryUser = new OrdinaryUser("firefly");
        User administration = new Administration("PYmili");
        register(ordinaryUser);
        register(administration);

        // fail
        User failOrdinaryUser = new OrdinaryUser();
        register(failOrdinaryUser);

        // instanceof
        if (ordinaryUser instanceof OrdinaryUser instanceofOrdinaryUser) {
            System.out.println("instanceof Name: " + instanceofOrdinaryUser.getUserName());
        } else {
            System.out.println("not instanceof");
        }
    }
    public static void register(User user) {
        if (user.getUserName() != "null") {
            System.out.println("Register User:");
            System.out.println("\tUser name: " + user.getUserName());
            System.out.println("\tUser Type: " + user.getUserType());
        } else {
            System.out.println("Register fail:");
            System.out.println("\tFailure reason: UserName is Null.");
        }
    }
}
