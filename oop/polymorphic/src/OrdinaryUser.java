package polymorphic.src;

public class OrdinaryUser extends User {
    public OrdinaryUser() {
        super("null", UserType.ordinary);
    }
    public OrdinaryUser(String userName) {
        super(userName, UserType.ordinary);
    }
}
