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

#### Rectangle 文件(override包)
- 非之前的 Rectangle类
- 
