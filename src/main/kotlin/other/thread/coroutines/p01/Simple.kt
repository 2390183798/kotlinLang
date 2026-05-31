package org.dodo.other.thread.coroutines.p01

import kotlinx.coroutines.*

fun run01() = runBlocking { // this: CoroutineScope
    launch { // launch a new coroutine and continue
        delay(1000L) // non-blocking delay for 1 second (default time unit is ms)
        println("World!") // print after delay
    }
    println("Hello") // main coroutine continues while a previous one is delayed
}

fun run02() = runBlocking { // this: CoroutineScope
    launch { // launch a new coroutine and continue
        doWorld02()
    }
    println("Hello") // main coroutine continues while a previous one is delayed
}

fun run03() = runBlocking { // this: CoroutineScope
    doWorld03()
}

// this is your first suspending function
suspend fun doWorld02() {
    delay(1000L)
    println("World!")
}

//suspend fun doWorld03() = coroutineScope {  // this: CoroutineScope
suspend fun doWorld03() = coroutineScope {  // this: CoroutineScope
    launch {
        delay(1000L)
        println("World!")
    }
    println("Hello")
}


fun main()  { // this: CoroutineScope
//    run01()
//    run02()
    run03()
}

