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


fun main() {
    run01()
}
