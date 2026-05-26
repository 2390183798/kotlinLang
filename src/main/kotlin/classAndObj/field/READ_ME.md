### 简单说明

#### Address （main）
- 对应的属性
- 方法，copy对象


#### Rectangle （main）
- 定义 area 的 get() 方法， 直接用 对象.area 调用 get()方法
- 在 属性下面添加 private set
  - 外部不能 set
  - 内部可以 set
- 在 set 中判断后 （幕后字段）
  - 可以用 field = value 处理当前 属性


#### MyTestAnno （lateinit）
- 自定义注解，模拟JUnit的实现
  - @TestCase 类标记
  - @Test 测试方法
  - @TestInfo 测试方法描述】
  - @SetUp 初始化对象用，防止 lateinit对象 没有初始化
- runTests(testInstance: Any) 实现
  - 按注解的情况，处理对应的逻辑

#### MyTest （lateinit）
- lateinit 的使用
- MyTestAnno 中 自定义注解的使用
- MyTestAnno 中 runTests() 使用
- 注意，要添加 kotlin-reflect 的依赖
