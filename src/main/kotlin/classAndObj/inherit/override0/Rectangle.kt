package org.dodo.classAndObj.inherit.override0

import org.dodo.classAndObj.inherit.override0.Rectangle

open class Rectangle {
    open fun draw() { println("Drawing a rectangle") }
//    val borderColor: String get() = "black"
    val borderColor: String = "black"
}

/**
 * 子类用 使用 super 关键字调用其超类的函数与属性
 */
class FilledRectangle : Rectangle() {
    override fun draw() {
        super.draw()
        println("Filling the rectangle")
    }

    val fillColor: String get() = super.borderColor
}
