### 简单说明


#### 数据类 data class
- data class 开头的类
- 例如：
```kotlin
data class User(val name: String, val age: Int)
```
- 对应的函数
  - equals()/hashCode() 
  - toString() 格式是 "User(name=John, age=42)"
  - componentN() 函数 按声明顺序对应于所有属性。
  - copy()
- 满足的要求
  - 主构造函数必须至少有一个参数。
  - 主构造函数的所有参数必须标记为 val 或 var。
  - 数据类不能是抽象、开放、密封或者内部的。

#### 数据类 ==对比 02
- 普通 class
  - 默认继承 Any 的 equals() 方法
  - equals() 默认实现是比较引用（和 === 一样）
  - 即使内容相同，== 也返回 false
- data class
  - Kotlin 编译器会自动生成 equals() 方法
  - 自动生成的 equals() 会比较，【主构造函数】中的【所有属性】
  - 只要属性值相同，== 就返回 true

#### 数据类 copy 和 解构声明 03
- copy() 可以复制 传参以外所有的值
- 解构声明
  - 将对象 解构 为 对应的属性
