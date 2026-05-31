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
  - join() 后面的代码，会等待 协程完成后
  - 也就是 join 进来，才会执行
- 多个 job.join()

#### 协程 取消/超时 p03
- 取消 job.cancel()
  - 异步发送取消
- cancel 和 join 过程  ::run01
    - 先job.cancel()
    - 再job.join()
    - 收到 cancel， job也会触发 join
    - 主线程 join后面的代码，
      - 收到join后
      - 会执行
- cancel 和 join 替代
  - job.cancelAndJoin()
- 如果 协程cpu一直处理    ::run02
  - job.cancelAndJoin()
  - 是取消不掉的 
  - 会等到执行完，再join
- 捕获cancel的异常    ::run03
  - job.cancelAndJoin() 触发后
  - job中 捕获异常，会捕获 cancel的异常
    - 不会触发cancel
  - 只能等 协程结束后的 join


#### 协程 yield  p04
- while (isActive) 处理
- try ~ finally 中 处理
- 
