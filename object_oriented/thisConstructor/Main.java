package object_oriented.thisConstructor;

public class Main {
    public static void main(String[] args) {
        Administrators administrators = new Administrators();
        System.out.println("Administrators name: " + administrators.getName());
        System.out.println("Administrators password: " + administrators.getPassword());
    }
}
