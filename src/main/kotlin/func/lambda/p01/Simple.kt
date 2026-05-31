package org.dodo.func.lambda.p01


//max(strings, { a, b -> a.length < b.length })

fun compare(a: String, b: String): Boolean = a.length < b.length

val sum: (Int, Int) -> Int = { x: Int, y: Int -> x + y }

val sum02 = { x: Int, y: Int -> x + y }



fun main() {
    println("1 对比 2： " + compare("111","2"))

    println("sum ： " + sum(1,2))
    println("sum ： " + sum.invoke(1,2))
    println("sum02 ： " + sum02.invoke(1,2))

    println()
    val items = listOf(1, 2, 3, 4, 5)
    val product = items.fold(1) { acc, e -> acc * e }
    println("product ： $product")
}

