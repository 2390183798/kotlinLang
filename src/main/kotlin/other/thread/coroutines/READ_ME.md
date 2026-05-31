### 简单说明

#### 协程
- 使用前， pom 需要添加 
  - coroutines 依赖


#### launch 第一个协程 p01
- 第一个demo
  - launch 启动协程
  - delay （sleep 多久）
  - runBlocking 协程对应方法的范围
    - 没有 runBlocking，不识别 launch
- 提出launch内到方法
  - launch内，调用方法，必须是 suspend fun
  - 过程
    - 提取 suspend fun
    - 在 launch内调用
- 再次提取
- 总结
  - 层级嵌套为
    - 总 runBlocking
      - 直接套 fun 要加 coroutineScope
    - launch在 runBlocking 中
      - 直接套 fun 要加 coroutineScope
    - suspend fun
      - 内部要有 suspend fun
      - 外部要有 launch


#### 多个launch 协程 p02
- coroutineScope 中
  - 多个launch
- job.join() 理解
- 多个 job.join()

#### 协程 取消/超时 p03
- 取消 job.cancel()
