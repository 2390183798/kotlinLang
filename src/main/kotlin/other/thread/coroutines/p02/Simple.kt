package org.dodo.other.thread.coroutines.p02

import kotlinx.coroutines.*

//sampleStart
// Sequentially executes doWorld followed by "Done"
fun run01() = runBlocking {
    doWorld()
    println("Done")
}

// Concurrently executes both sections
suspend fun doWorld() = coroutineScope { //this: CoroutineScope
    launch {
        delay(2000L)
        println("World 2")
    }
    launch {
        delay(1000L)
        println("World 1")
    }
    println("Hello")
}
//sampleEnd

fun run02() = runBlocking {
    val jobEnd = launch { // launch a new coroutine and keep a reference to its Job
        delay(1000L)
        println("World 03!")
    }
    val job = launch { // launch a new coroutine and keep a reference to its Job
        delay(2000L)
        println("World 01!")
    }
    val job2 = launch { // launch a new coroutine and keep a reference to its Job
        delay(3000L)
        println("World 02!")
    }

    println("Hello")
    job2.join() // wait until child coroutine completes
    job.join() // wait until child coroutine completes
    jobEnd.start()
    println("Done")
}


fun main() {
//    run01()
    run02()
}
