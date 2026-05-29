package org.dodo.classAndObj.packagee

open class Outer {
    private val a = 1
    protected open val b = 2
    internal open val c = 3
    val d = 4  // 默认 public

    protected class Nested {
        public val e: Int = 5
    }
}

class Subclass : Outer() {
    // a 不可见
    // b、c、d 可见
    // Nested 和 e 可见

    override val b = 5   // “b”为 protected
    override val c = 7   // 'c' is internal
}


class Unrelated(o: Outer) {
//class Unrelated{
//    constructor(o: Outer){
//        o.
//    }
    // o.a、o.b 不可见”
    fun doSth(){
        var c = Cc(1,2)
    }
}

class Cc private constructor(a: Int) {

    constructor(a: Int, b: Int) : this(a) {

    }
    fun doSth(){

    }
}

fun main() {
    var out = Outer()
    var un = Unrelated(out)
}
