package org.dodo.classAndObj.t

class Box<T>(t: T) {
    var value = t
    override fun toString(): String {
        return "Box(value=$value)"
    }

}


fun main() {
    val box: Box<Int> = Box<Int>(1)
    println("box: " + box.value)
    println("box: " + box)
}
