### 简单说明

#### 空安全
- 普通类型，不能定义为 null
- 类型后面加上 ?
  - 表示可以为空
  - var b: String? = "abc"

#### 空相关写法 p01 Safe
- 安全调用 ?.
  - a?.length
    - 要么返回 长度int
    - 要么返回 null
- 支持链式调用
  - bob?.department?.head?.name


#### Elvis 操作符 （else） p02
- 类似else  ?:
  - b?.length ?: 0
    - 要么返回 长度int
    - 要么null的时候，返回0

#### 非空断言 !!
- 尽量少用

#### null的接收 p03
- 对应类， 覆写toString
  - 如果空，返回 "null"
    - 可以避免空指针
- data class 的toString
  - 空会返回 null
  - 对应字段 也会返回 null 的string


