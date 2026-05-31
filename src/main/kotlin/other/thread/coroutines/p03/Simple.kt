package org.dodo.other.thread.coroutines.p03

import kotlinx.coroutines.*

fun run01() = runBlocking {
//sampleStart
    val job = launch {
        repeat(1000) { i ->
            println("job: I'm sleeping $i ...")
            delay(500L)
        }

//        repeat(5) { i ->
//            try {
//                // print a message twice a second
//                println("job: I'm sleeping $i ...")
//                delay(500)
//            } catch (e: Exception) {
//                // log the exception
//                println(e.message)
//            }
//        }
    }
    delay(1300L)
    println("main: I'm tired of waiting!")

//    println(">>> 准备调用 cancel()")
//    job.cancel()  // 立即返回
//    println(">>> cancel() 已返回，但协程可能还在运行")
//
//    println(">>> 准备调用 join()")
//    job.join()    // 等待协程真正结束
//    println(">>> join() 已返回，协程确实结束了")

    job.cancelAndJoin()

    println("main: Now I can quit.")
//sampleEnd
}


fun run02() = runBlocking {
//sampleStart
    val startTime = System.currentTimeMillis()
    val job = launch(Dispatchers.Default) {
        var nextPrintTime = startTime
        var i = 0
        while (i < 10) { // 一个执行计算的循环，只是为了占用 CPU
            // 每秒打印消息两次
            try {
                if (System.currentTimeMillis() >= nextPrintTime) {
                    println("job: I'm sleeping ${i++} ...")
                    nextPrintTime += 500L
                }
            } catch (e: Exception) {
                // log the exception
                println(e)
            }

        }
    }
    delay(1300L) // 等待一段时间
    println("main: I'm tired of waiting!")
    job.cancelAndJoin() // 取消一个作业并且等待它结束
    println("main: Now I can quit.")
//sampleEnd
}


fun run03() = runBlocking {
//sampleStart
//    val job = launch(Dispatchers.Default) {
    val job = launch {
        repeat(5) { i ->
            try {
                // print a message twice a second
                println("job: I'm sleeping $i ...")
                delay(500)
            } catch (e: Exception) {
                // log the exception
                println(e.message)
            }
        }
    }
    delay(1300L) // delay a bit
    println("main: I'm tired of waiting!")
    job.cancelAndJoin() // cancels the job and waits for its completion
    println("main: Now I can quit.")
//sampleEnd
}

fun main()  { // this: CoroutineScope
//    run01()
//    run02()
    run03()
}

