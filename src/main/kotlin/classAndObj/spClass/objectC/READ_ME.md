### 简单说明


#### 对象类相关 object
- 理解 object关键字
    - 通常处理
        - 单例类， 对象声明 manager 等
        - 内部类， 伴生对象 companion object ，工厂（java 静态成员）
        - 对象表达式， 匿名内部类 - 用于 回调，监听 等 接口实现

##### 对象类 object
- 理解 DataProviderManager （object）
    - 单例类， object 声明

##### 单例数据类 data object
- 理解 MyDataObject （data object）
    - data object
        - 既是 data 数据类， 也是 object 单例
        - toString 默认是现实 类名
            - 可以 override
- 理解 MySingleton （data object）
    - data object 中的 == 和 ===
        - data 的 == 对比的是 equals方法
            - 同一个data， equals 都是一样的
        - data 的 === 对比的是 引用地址
            - 不同对象，引用地址是不一样的
    - 注意：
        - 不能 override 方法 equals or hashCode

##### data object  和 data class 区别
- data object 没有的
    - 没有 copy()
        - 单例， 不需要copy()
    - 没有 componentN()
        - componentN() 是解构用到
            - 例如:
                - component1()
                - component2()
                - component3()
        - 这里属性不会变化，不需要解构
```kotlin
data class User(val name: String, val age: Int, val email: String)

fun main() {
    val user = User("Alice", 25, "alice@example.com")
    
    // 方式 1：手动调用 componentN()
    println(user.component1())  // Alice
    println(user.component2())  // 25
    println(user.component3())  // alice@example.com
    
    // 方式 2：使用解构声明（更常用）
    val (name, age, email) = user
    println(name)   // Alice
    println(age)    // 25
    println(email)  // alice@example.com
}
```

- data object 在 sealed中
    - 在sealed 中， 用 data object 而不用 object
        - data object 不用 覆写 toString()



##### 伴生对象 companion object
- 内部类， 伴生对象 companion object ，
    - 工厂（java 静态成员）
- 理解 User
    - 伴生对象，可以用于 工厂，创建对象
- 理解 UserRef
    - 伴生对象，无论有没有名字
    - 都可以直接调用 companion object 中的方法
    - 类名.func()
- 理解 Factory
    - 伴生对象，实现接口
    - 就是类型的转变，没啥区别

##### 匿名类 anonymous object
- 直接匿名类
    - object {}
    - object { override fun toString() = "hello" }
- 理解 BankAccount 中
    - temporaryAccount 的 匿名内部类
        - 处理 BankAccount 的初始化
        - 处理 Transaction 接口的实现
    - specialTransaction()
        - 写内部类，以及 内部类的调用
    - 整个其实是用 方法包了一层 匿名内部类的代理实现
- 理解 UserPreferences
    - 其中 getPreferences() = object {xxx}
        - 是通过方法，返回 匿名对象的结构

##### object 申明 和 anonymous object 匿名对象 差异
- anonymous object 匿名对象
    - 在使用的地方，直接执行
- object 申明
    - 在第一次被访问的时候，延迟初始化
- companion object 伴生对象
    - 对应的类 被加载的时候
        - 和java的静态内部类一样
