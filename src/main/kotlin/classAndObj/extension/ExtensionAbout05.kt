package org.dodo.classAndObj.extension

class MyClass {
    companion object { }  // 将被称为 "Companion"
}

fun MyClass.Companion.printCompanion() {
    println("companion00")
}

fun main() {
    MyClass.printCompanion()
}
