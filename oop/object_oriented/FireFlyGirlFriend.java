package object_oriented;

public class FireFlyGirlFriend extends GirlFriend {
    /**
     * 流萤女朋友类无参构造函数
     */
    public FireFlyGirlFriend() {
        super();
        super.setName("流萤");
        super.setAge(18);
        super.setWeight(80);
        super.setHeight(180);
        super.setCharacter(GirlFriendType.Character.Perfectness);;
        super.setCurrent_mood(GirlFriendType.CurrentMood.Happy);
    }

    /**
     * 流萤女朋友类有参构造函数
     * @param name
     * @param age
     * @param weight
     * @param height
     * @param character
     * @param current_mood
     */
    public FireFlyGirlFriend(
        String name,
        int age,
        double weight, double height,
        GirlFriendType.Character character,
        GirlFriendType.CurrentMood current_mood
        ) {
            super(name, age, weight, height, character, current_mood);
    }

    /**
     * 静态行为：点燃大海
     */
    public void lightTheOcean() {
        System.out.print("我将，点燃大海");
        if (super.getMoodValue() > 50) {
            System.out.println("！ o(*￣▽￣*)o");
        } else {
            System.out.println("... （＃￣～￣＃）");
        }
    }
}
