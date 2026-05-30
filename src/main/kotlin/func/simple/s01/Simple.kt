package org.dodo.func.simple.s01


/**
 * 函数
 */
fun double(x: Int): Int {
    return 2 * x
}

/**
 * 默认参数
 */
fun read(
    b: ByteArray,
    off: Int = 0,
    len: Int = b.size,
) {
    println("off: $off, len: $len")
}

open class A {
    open fun foo(i: Int = 10) {
        println("A: foo $i")
    }
}

/**
 * override 入参， 不能有默认值
 */
class B : A() {
    override fun foo(i: Int) {
        println("B: foo $i")
    }  // 不能有默认值
}

/**
 * 第一个默认参数
 */
fun foo(
    bar: Int = 0,
    baz: Int,
) {
    println("func foo  bar : $bar,  baz: $baz")
}


fun foo02(
    bar: Int = 0,
    baz: Int = 1,
    qux: () -> Unit,
) {
    println("in foo02  bar : $bar,  baz: $baz")
    qux()
}



fun main() {
    val result = double(2)
    println("result: $result")

    val b = ByteArray(20)
    read(b)


    B().foo(3)

    foo(baz = 1)

    println("")

    foo02(1) { println("out foo02 -01 hello") }     // 使用默认值 baz = 1
    foo02(qux = { println("out foo02 -02 hello") }) // 使用两个默认值 bar = 0 与 baz = 1
    foo02 { println("out foo02 -03 hello") }        // 使用两个默认值 bar = 0 与 baz = 1
}
