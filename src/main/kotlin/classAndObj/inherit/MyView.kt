package org.dodo.classAndObj.inherit

class Circle() : Shape() {
    override fun draw() { /*……*/ }
}

open class Rectangle() : Shape() {
    override val vertexCount = 4
    final override fun draw() { /*……*/ }
}

open class Shape {
    open val vertexCount: Int = 0
    open fun draw() { /*……*/ }
    fun fill() { /*……*/ }
}


//class MyView : View {
//    constructor(ctx: Context) : super(ctx)
//    constructor(ctx: Context, attrs: AttributeSet) : super(ctx, attrs)
//}
