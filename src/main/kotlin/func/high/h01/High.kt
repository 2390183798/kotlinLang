package org.dodo.func.high.h01

class High {
}


fun <T, R> Collection<T>.fold(
    initial: R,
    combine: (acc: R, nextElement: T) -> R
): R {
    var accumulator: R = initial
    for (element: T in this) {
        accumulator = combine(accumulator, element)
    }
    return accumulator
}

fun main() {
    //sampleStart
    val items = listOf(1, 2, 3, 4, 5)

    // Lambdas 表达式是花括号括起来的代码块。
    val result = items.fold(0) {
        // 如果一个 lambda 表达式有参数，前面是参数，后跟“->”
        acc: Int, next: Int ->
        print("acc = $acc, next = $next, ")
        val result = acc + next
        println("result = $result")
        // lambda 表达式中的最后一个表达式是返回值：
        result
    }
    println()
    println("01 result = $result")

    // lambda 表达式的参数类型是可选的，如果能够推断出来的话：
    val joinedToString = items.fold("Elements:") { acc, i -> "$acc $i" }

    // 函数引用也可以用于高阶函数调用：
    val product = items.fold(1, Int::times)
    //sampleEnd
    println()
    println("02 joinedToString = $joinedToString")
    println()
    println("03 product = $product")
}
