package polymorphic.src;

enum UserType {
    ordinary,           // 普通用户
    Administration      // 管理员
}

public class User {
    private String userName;
    private UserType userType = UserType.ordinary;

    public User() {}
    public User(String userName, UserType userType) {
        this.userName = userName;
        this.userType= userType;
    }

    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public UserType getUserType() {
        return userType;
    }
    public void setUserType(UserType userType) {
        this.userType = userType;
    }
}
