package object_oriented;

public class Main {
    public static void main(String[] args) {
        GirlFriend girl_friend = new GirlFriend();

        // 写入信息
        girl_friend.setName("流萤");
        girl_friend.setAge(18);
        girl_friend.setWeight(80);
        girl_friend.setHeight(180);
        girl_friend.setCharacter(GirlFriendType.Character.Perfectness);;
        girl_friend.setCurrent_mood(GirlFriendType.CurrentMood.Happy);

        // 输出信息
        girl_friend.printInfo();
    }
}
