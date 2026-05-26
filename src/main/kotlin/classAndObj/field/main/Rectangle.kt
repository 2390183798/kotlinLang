package org.dodo.classAndObj.field.main

class Rectangle(val width: Int, val height: Int) {
    val area: Int // property type is optional since it can be inferred from the getter's return type
        get() = this.width * this.height

    var rep : String = "rep"
        private set

    var stringRepresentation: String
        get() = this.toString()
        set(value) {
            setDataFromString(value) // 解析字符串并赋值给其他属性
        }

    var counter = 0 // 这个初始器直接为幕后字段赋值
        set(value) {
            if (value >= 0)
                field = value
            // counter = value // ERROR StackOverflow: Using actual name 'counter' would make setter recursive
        }

    val isEmpty: Boolean
        get() = this.counter == 0

    fun setDataFromString(value: String){
        this.rep = value
    }

    override fun toString(): String {
        return "Rectangle(width=$width, height=$height, area=$area, rep='$rep'), counter='${counter}'"
    }


}
//sampleEnd
fun main() {
    val rectangle = Rectangle(3, 4)
    println("Width=${rectangle.width}, height=${rectangle.height}, area=${rectangle.area}")
    println("stringRepresentation=${rectangle.stringRepresentation}")

    rectangle.stringRepresentation = "newRep"
    rectangle.counter = 5
//    rectangle.rep = "aa"  // private set 不能外部调用

    println("Width=${rectangle.width}, height=${rectangle.height}, area=${rectangle.area}")
    println("stringRepresentation=${rectangle.stringRepresentation}")


}
