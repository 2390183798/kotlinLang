package org.dodo.func.simple.s03

class Sample {
    fun foo() {
        println("Foo")
    }
}

fun <T> singletonList(item: T): List<T> {
    return listOf(item)
}


fun main() {
    Sample().foo()

    println(singletonList(2))
}
