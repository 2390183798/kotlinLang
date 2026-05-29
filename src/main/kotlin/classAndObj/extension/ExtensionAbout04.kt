package org.dodo.classAndObj.extension


val <T> List<T>.lastIndex: Int
    get() = size - 1



fun main() {
    var dd = mutableListOf<Int>()
    dd.add(1)
    dd.add(2)
    dd.add(3)
    println(dd.toString())
    println(dd.lastIndex)
}
