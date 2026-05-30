### 简单说明

#### 内部类 inner
- 用 Outer.Nested() 初始化
- 匿名内部类
  - 暂时略


#### 枚举类 enum
- 常见 enum Direction
- 带参数的 enum Color
- 匿名枚举类 ProtocolState (IntArithmetics)
  - enum 中有个 抽象方法 
    - 枚举对象，需要实现这个方法
    - 匿名类实现的
  - enum 的遍历
    - for (f in IntArithmetics.entries)

#### 内联类 Inline value classes
- 理解 Password 类
  - value class 开头
  - 标注 @JvmInline
- 理解 Person
  - 只能有简单的属性 （String 等）
  - 不能有 lateinit/delegated  属性
- 理解 Name 和 Printable 接口
  - 内联 是 final的， 不能继承
  - 可以实现接口
- 理解 Foo
  - 装箱，拆箱 等 （没感觉到意义..）
- 理解 MyInterfaceWrapper
  - 内联 对接口实现的代理
  - MyInterfaceWrapper 实现接口


#### 对象类 object
- 理解 object关键字
  - 通常处理
    - 单例类， 对象声明 manager 等
    - 内部类， 伴生对象 companion object ，工厂（java 静态成员）
    - 对象表达式， 匿名内部类 - 用于 回调，监听 等 接口实现
- 代码里面的
  - 理解 DataProviderManager （object）
    - 单例类， object 声明
  - 理解 MyDataObject （data object）
    - data object
      - 既是 data 数据类， 也是 object 单例
      - toString 默认是现实 类名
        - 可以 override
      - data object 中的 == 和 ===
        - data 的 == 对比的是 equals方法
          - 同一个data， equals 都是一样的
        - data 的 === 对比的是 引用地址
          - 不同对象，引用地址是不一样的
      - 注意：
        - 不能 override 方法 equals or hashCode
  - data object  和 data class 区别
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





