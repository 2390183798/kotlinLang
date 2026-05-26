package org.dodo.classAndObj.`interface`.sam

fun interface IntPredicate {
    fun accept(i: Int): Boolean
}


// 不用 lambda 表达式
val isEven01 = object : IntPredicate {
    override fun accept(i: Int): Boolean {
        return i % 2 == 0
    }
}


// 通过 lambda 表达式创建一个实例
val isEven02 = IntPredicate { it % 2 == 0 }
