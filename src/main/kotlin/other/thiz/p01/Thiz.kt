package org.dodo.other.thiz.p01


class A { // 隐式标签 @A
    inner class B { // 隐式标签 @B
        fun Int.foo() { // 隐式标签 @foo
            val a = this@A // A 的 this
            val b = this@B // B 的 this

            val c = this // foo() 的接收者，一个 Int
            val c1 = this@foo // foo() 的接收者，一个 Int

            val funLit = lambda@ fun String.() {
                val d = this // funLit 的接收者，一个 String
                println("d: $d")
            }

            val funLit2 = { s: String ->
                // foo() 的接收者，因为它包含的 lambda 表达式
                // 没有任何接收者
                val d1 = this
                println("d1: $d1")
            }

            println("a: $a")
            println("b: $b")
            println("c: $c")
            println("c1: $c1")
            funLit.invoke("d00")
            funLit2.invoke("d01")

        }

        fun doSth(){
            2.foo()
        }
    }
}

fun main() {
    var obj = A().B().doSth()

}
