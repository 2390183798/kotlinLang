package org.dodo.func.simple.s02

fun foo(vararg strings: String) { /*……*/ }


fun main() {
    foo(strings = *arrayOf("a", "b", "c"))
}

