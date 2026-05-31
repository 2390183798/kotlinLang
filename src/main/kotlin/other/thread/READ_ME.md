### 简单说明

#### thread相关处理
- 线程
- 回调
- Promise/Future
- 反应式扩展
- 协程

##### 线程
- 可以把长运行的fun定义为对象
  - 对象 传入 其他fun
  - 会单独线程运行
- 弊端
  - 线程会有消耗
  - 线程切换也有耗时和消耗
  - 线程数有限，会有瓶颈
  - 多线程，调试比较麻烦

##### 回调
- 层级增加，会增加复杂度
- Exception错误处理
  - Exception会传递
  - 处理比较复杂

##### Promise/Future
- Promise对象
- thenCompose 
  - 或 thenAccept
- 错误处理，也比较复杂


##### 反应式扩展 Rx
- java Rx 方式
  - 可观察流， 链式

##### 协程
- [协程](./coroutines/READ_ME.md)
