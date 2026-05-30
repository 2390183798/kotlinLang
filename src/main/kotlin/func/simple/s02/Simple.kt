package org.dodo.func.simple.s02

fun foo(vararg strings: String) {
    print("[")
    for (i in strings.indices){
        print("$i")
        if(i< strings.lastIndex){
            print(", ")
        }
    }
//    print(strings.joinToString(","))
    println("]")
}

fun printHello(name: String?): Unit {
    if (name != null)
        println("Hello $name")
    else
        println("Hi there!")
    // `return Unit` 或者 `return` 是可选的
}

fun printHello02(name: String?){
    if (name != null)
        println("Hello $name")
    else
        println("Hi there!")
    // `return Unit` 或者 `return` 是可选的
    return Unit
}

fun double(x: Int): Int = x * 2

fun double02(x: Int) = x * 2

infix fun Int.shl02(x: Int): Int {
    return this * x
}


fun main() {
    foo(strings = *arrayOf("a", "b", "c"))

    printHello("Jim")

    double(4)

    // 用中缀表示法调用该函数
    println(1 shl02 2)

    // 等同于这样
    println(1.shl02(2))

}

