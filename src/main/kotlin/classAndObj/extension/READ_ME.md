### 简单说明

#### extension 01
- 对应类的扩展
- 直接在对应的类，添加方法

##### extension 覆盖 02
- 如果之前有方法，则无效
- 如果之前有方法，入参不一样，则生效

##### extension 空接收 03
- Any?.toString() 扩展空指针 相关

##### extension 属性 04
- 一般 对应属性 添加 get() = xxx
```kotlin
val <T> List<T>.lastIndex: Int
    get() = size - 1
```

##### extension 伴生对象 05
- XXX.Companion.yyy()
  - MyClass.Companion.printCompanion()

