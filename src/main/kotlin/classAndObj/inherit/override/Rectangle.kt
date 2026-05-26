package org.dodo.classAndObj.inherit.override

import org.dodo.classAndObj.inherit.override.Rectangle

open class Rectangle {
    open fun draw() { println("Drawing a rectangle") }
//    val borderColor: String get() = "black"
    val borderColor: String = "black"
}

//sampleStart
class FilledRectangle: Rectangle() {
    override fun draw() {
        val filler = Filler()
        filler.drawAndFill()
    }

    inner class Filler {
        fun fill() {
            println("Filling")
        }
        fun drawAndFill() {
            super@FilledRectangle.draw() // 调用 Rectangle 的 draw() 实现
            fill()
            println("Drawn a filled rectangle with color ${super@FilledRectangle.borderColor}") // 使用 Rectangle 所实现的 borderColor 的 get()
        }
    }
}
//sampleEnd

fun main() {
    val fr = FilledRectangle()
    fr.draw()
    fr.borderColor
}
