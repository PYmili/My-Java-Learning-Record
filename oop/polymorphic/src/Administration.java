package polymorphic.src;

public class Administration extends User {
    public Administration() {
        super("null", UserType.Administration);
    }
    public Administration(String userName) {
        super(userName, UserType.Administration);
    }
}
