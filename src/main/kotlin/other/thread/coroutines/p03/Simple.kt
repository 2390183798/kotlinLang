package org.dodo.other.thread.coroutines.p03

import kotlinx.coroutines.*

fun run01() = runBlocking {
//sampleStart
    val job = launch {
        repeat(1000) { i ->
            println("job: I'm sleeping $i ...")
            delay(500L)
        }
    }
    delay(1300L) // 延迟一段时间
    println("main: I'm tired of waiting!")
    job.cancel() // 取消该作业
    job.join() // 等待作业执行结束
    println("main: Now I can quit.")
//sampleEnd
}


fun main()  { // this: CoroutineScope
    run01()
}

