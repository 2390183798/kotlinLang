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

#### delegated 理解 d03
- Derived 和 BaseImpl 都 override 属性
- 他们只会访问自身类， override 的属性
- 具体 看demo即可


#### 属性 by Delegate() 理解 properties01
- 属性 by 委托类
- 委托类
  - operator fun getValue(thisRef: Any?, property: KProperty<*>)
  - operator fun setValue(thisRef: Any?, property: KProperty<*>, value: String)
- 委托类 做对应的实现


#### 属性 by lazy 理解 propByLazy
- 延迟属性委托
- 格式
  - val lazyValue: Type by lazy {xxx}
- 过程
  - 第一次会执行 lazy {xxx} 所有内容
  - 后面，只会执行 lazy {xxx} 中的 return


#### 属性 by Delegates.observable 理解 propByObs
- 可观察属性委托
- 处理可观察委托后
  - 它有三个参数：
    - 被赋值的属性 (属性名字)
    - 旧值
    - 新值

#### 属性 by xx::yy 理解 propByOther
- 委托给另一个属性
- 格式
  - 当前构造，或者属性 中（基础类型）
    - by this::xxx
  - 当前构造，或者属性 中（引用类型）
    - by xxClass::xxInt
  - 顶层属性 中
    - by ::topLevelInt
    - by ::topLevelClass


#### 属性 by Map 理解 propByMap
- 委托给Map
- map类型
  - Map
  - MutableMap 都行

#### 后续暂时略
