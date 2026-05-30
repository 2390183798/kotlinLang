package org.dodo.classAndObj.spClass.objectC.dataObject

data object MyDataObject {
    val number: Int = 3
    override fun toString(): String {
        return "MyDataObject(number=$number)"
    }

//    override fun equals(other: Any?): Boolean {
//        return super.equals(other)
//    }
//
//    override fun hashCode(): Int {
//        return super.hashCode()
//    }
}

fun main() {
    println(MyDataObject)
    println(MyDataObject.number)
    // MyDataObject
}
