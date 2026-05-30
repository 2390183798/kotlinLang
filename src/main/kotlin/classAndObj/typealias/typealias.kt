package org.dodo.classAndObj.`typealias`

class A {
    inner class Inner{
        fun pri(){
            println("println A.Inner")
        }
    }
}
class B {
//    private inner class Inner{
    inner class Inner{
        fun pri(){
            println("println B.Inner")
        }
    }
    fun pri(){
        Inner().pri()
    }
}

typealias AInner = A.Inner
typealias BInner = B.Inner

fun main() {
    val innerA: AInner = A().Inner()
    innerA.pri()

    val innerB: BInner = B().Inner()
    innerB.pri()

    B().pri()
}


