package org.dodo.classAndObj.extension

class Example {
    fun printFunctionType() {
        println("Class method")
    }
}

fun Example.printFunctionType() {
    println("Extension function")
}
fun Example.printFunctionType(i: Int) {
    println("Extension function #$i")
}


fun main() {
    Example().printFunctionType()
    Example().printFunctionType(1)

}
