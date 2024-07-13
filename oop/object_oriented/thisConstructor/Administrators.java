package object_oriented.thisConstructor;

public class Administrators {
    private String name;
    private String password;

    public Administrators() {
        // 调用本类的有参构造
        this("root", "null");
    }
    public Administrators(String name, String password) {
        this.name = name;
        this.password = password;
    }
    
    // get/set function
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
}
