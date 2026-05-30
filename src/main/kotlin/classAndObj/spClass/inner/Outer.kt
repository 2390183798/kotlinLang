package org.dodo.classAndObj.spClass.inner

class Outer {
    private val bar: Int = 1
    class Nested {
        fun foo() = 2
    }
}


fun main() {
    val demo = Outer.Nested().foo()
    println("demo: $demo")
}
