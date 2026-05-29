package org.dodo.classAndObj.extension

fun MutableList<Int>.swap(index1: Int, index2: Int) {
    val tmp = this[index1] // “this”对应该列表
    this[index1] = this[index2]
    this[index2] = tmp
//    println("index1: ${this[index1]} ,index2: ${this[index2]}")
}


fun main() {
    val list = mutableListOf(1, 2, 3)
    println("before: ${list.toString()}")
    list.swap(0, 2)
    println("after: ${list.toString()}")

}
