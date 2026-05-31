package org.dodo.other.thread.coroutines.p05

import kotlinx.coroutines.*

fun run01() = runBlocking {
//sampleStart
    withTimeout(1300L) {
        repeat(1000) { i ->
            println("I'm sleeping $i ...")
            delay(500L)
        }
    }
//sampleEnd
}

fun run02() = runBlocking {
//sampleStart
    val result = withTimeoutOrNull(1300L) {
        repeat(1000) { i ->
            println("I'm sleeping $i ...")
            delay(500L)
        }
        "Done" // 在它运行得到结果之前取消它
    }
    println("Result is $result")
//sampleEnd
}

var acquired = 0
class Resource {
    init { acquired++
        println("Resource init $acquired")
    } // Acquire the resource
    fun close() { acquired--
        println("Resource close $acquired")
    } // Release the resource
}

//val time = 10000
const val time = 100
fun runR() = runBlocking {

    println("开始!!")
    repeat(time) { // Launch 10K coroutines
        val job = launch {
            var resource: Resource? = null // Not acquired yet
            try {
                withTimeout(60) { // Timeout of 60 ms
                    println("r withTimeout 内部 : $it")
                    resource = Resource()
                    delay(50) // Delay for 50 ms
                    // Store a resource to the variable if acquired
                }
                // We can do something else with the resource here
            } finally {
//                println("r finally")
                resource?.close() // Release the resource if it was acquired
//                println("r 释放资源")
            }
        }

        job.join()
        println("$it 最后： $acquired")
    }

}




fun main()  { // this: CoroutineScope
//    run01()
//    run02()
//    run03()
    runR()
}

