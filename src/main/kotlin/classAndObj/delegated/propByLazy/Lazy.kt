package org.dodo.classAndObj.delegated.propByLazy

val lazyValue: String by lazy {
    println("computed!")
    println("computed2!")

    "Hello"
}

fun main() {
    println(lazyValue)
    println(lazyValue)
}
