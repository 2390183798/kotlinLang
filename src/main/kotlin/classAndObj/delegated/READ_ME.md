### 简单说明

#### delegated 委托
- 知道 继承是高耦合，对代码不友好
- 委托 是 继承的替代方案
  - 委托给指定类来实现对应的接口


#### 最初的理解 d01
- Derived 委托的理解
- 其中的类
  - Base 要实现的接口
  - BaseImpl 实现类 （可以有多种实现， 可以 策略模式差不多）
  - Derived 委托类 （委托给对应的实现类， 和 策略模式 类似）

#### delegated 理解 d02
- 和前面的区别
- Derived 委托类 有override
  - 没有 override 的方法， 用 委托实现类 的实现
  - 有 override 的方法， 用 Derived 的实现
