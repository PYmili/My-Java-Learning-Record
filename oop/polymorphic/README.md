# polymorphic - 多态

多态是一种设计思想，当我们面对多个需要处理的 ***Object*** 时我们可能会对其写多个处理方法。

## eg

例如当前有多个用户类型：*ordinary(普通)*, *Administration(管理员)*
我们需要对其进行注册操作。

- 不使用多态
  
  ```java
  public void register(Ordinary ordinay) {
    ...
  }
  public void register(Administration administration) {
    ...
  }
  ```
  
  会出现写多个实现方法的问题，这是不明智的处理方法。

- 使用多态
  
    ```java
    public void register(User user) {
        ...
    }
    ```

    使用多态，我们只需要使用两个对象的***父类***进行实现即可。

## 注意

使用多态，我们应该使 *ordinary(普通)*, *Administration(管理员)* 共同继承一个父类(eg)：*User*，这样才能正常使用多态。


### instanceof 关键字

***instanceof*** 可将指定的类型进行判断和转换

- eg
  
  ```java
    // instanceof
    if (ordinaryUser instanceof OrdinaryUser instanceofOrdinaryUser) {
        System.out.println(
            "instanceof Name: " +   
            instanceofOrdinaryUser.getUserName()
        );
    } else {
        System.out.println("not instanceof");
    }
  ```

 将*ordinaryUser*这个类型使用*instanceof*进行判断，如果属于**Ordinary**类这进行转换，并赋值*instanceofOrdinaryUser*（java 14更新）。
