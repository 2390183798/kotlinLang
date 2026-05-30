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
  - 理解 DataProviderManager
    - 单例类， object 声明
  - 





