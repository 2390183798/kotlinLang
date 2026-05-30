package org.dodo.classAndObj.delegated.d02

interface Base {
    fun printMessage()
    fun printMessageLine()
}

class BaseImpl(val x: Int) : Base {
    override fun printMessage() { print(x) }
    override fun printMessageLine() { println(x) }
}

class Derived(b: Base) : Base by b {
    override fun printMessage() { print("abc") }
}


fun main() {
    val base = BaseImpl(10)
//    Derived(base).printMessageLine()
//    Derived(base).printMessage()
    val derived =Derived(base)
    derived.printMessageLine()
    derived.printMessage()
}
