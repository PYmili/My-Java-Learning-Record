package object_oriented;

class GirlFriendType {
    /**
     * 女朋友类中数据类型
     */

    private GirlFriendType() {}

    static enum Character {
        Perfectness, // 完美型
        Wisdom, // 智慧型
        Actively, // 活跃的
        Easygoing, // 随和的
        Authenticity, // 较真的
        Perplexity, // 疑惑型
        Tradition, // 传统型
        Cognitive, // 认知性
        intellectuality, // 理智性
        Physique, // 形体性
        Polyhedrality, // 多面性
        Independence, // 独立性
    }
    
    static enum CurrentMood {
        Happy, // 开心的
        Sad, // 伤心的
        Angry, // 生气的
        VeryAngry, // 非常生气
        Calm, // 镇定的
        Skeptical, // 怀疑的
        Shy, // 害羞的
        Expected, // 期待的
        Afraid, // 害怕的
        Jealous, // 嫉妒的，吃醋
    }
}

public class GirlFriend {
    /** 
     * 女朋友类，用于创建女朋友对象。
     */

    private String name; // 姓名
    private int age; // 年龄
    private double height, weight; // 身高，体重
    private GirlFriendType.Character character; // 性格
    private GirlFriendType.CurrentMood current_mood; // 当前心情

    public GirlFriend() {}

    /**
     * 女朋友类构造方法
     * @param name 名称
     * @param age 年龄
     * @param weight 体重
     * @param height 身高
     * @param character 性格
     * @param current_mood 当前心情
     */
    public GirlFriend(
        String name,
        int age,
        double weight, double height,
        GirlFriendType.Character character,
        GirlFriendType.CurrentMood current_mood
        ) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.character = character;
        this.current_mood = current_mood;
    }

    // 姓名get, set
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    // 年龄get, set
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    // 身高get, set
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }

    // 体重get, set
    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }

    // 性格get, set
    public GirlFriendType.Character getCharacter() {
        return character;
    }
    public void setCharacter(GirlFriendType.Character character) {
        this.character = character;
    }

    // 当前心情get, set
    public GirlFriendType.CurrentMood getCurrent_mood() {
        return current_mood;
    }
    public void setCurrent_mood(GirlFriendType.CurrentMood current_mood) {
        this.current_mood = current_mood;
    }

    public void printInfo() {
        System.out.println("名字：" + getName());
        System.out.println("年龄：" + getAge());
        System.out.println("身高：" + getHeight() + "cm");
        System.out.println("体重：" + getWeight() + "kg");
        System.out.println("性格：" + getCharacter());
        System.out.println("心情：" + getCurrent_mood());
    }
}
