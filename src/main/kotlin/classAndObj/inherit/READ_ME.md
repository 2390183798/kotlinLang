### 简单说明

#### Example
- Any 隐式继承 （和 Object 一样，是任何类的父类 ）
- Any 有三个方法：
  - equals()、 
  - hashCode() 
  - toString()
- final 的 类，不能被继承
- 可以被继承，必须是 open 的


#### MyView
```aiignore
class MyView : View {
    constructor(ctx: Context) : super(ctx)
    constructor(ctx: Context, attrs: AttributeSet) : super(ctx, attrs)
}
```
- 不同的次构造函数 调用基类型的不同的构造函数


##### MyView - Shape
- 定义open的方法
- 子类 Circle ，处理 override 对应open的 draw方法
- 子类 Rectangle， override 父类的 属性 

#### Base
- Base 和 派生类Derived
- 对应类的加载顺序
  - 先父 再子

#### Rectangle 文件(override0包)
- 子类用 使用 super 关键字调用其超类的函数与属性
- super.draw()

#### Rectangle 文件(override包)
- 子类中的内部类
- 用 super@FilledRectangle.draw() 调用 外部类的父类方法
  - super@Outer 来使用 外部类的super

#### Rectangle 文件(override2包)
- 虽然不支持多继承，
- 但是存在 继承和实现 中方法相同， 或者 多实现方法相同的情况
    - 使用 super<InterfaceName>.method() 明确调用特定接口的实现
    - kotlin的 interface 的方法，也支持 默认实现
