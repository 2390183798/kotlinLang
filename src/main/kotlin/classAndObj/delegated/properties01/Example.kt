package org.dodo.classAndObj.delegated.properties01

import kotlin.reflect.KProperty

class Example {
    var p: String by Delegate()
    override fun toString(): String {
        return "Example(${this.hashCode()%1000})"
    }

}


class Delegate {
    operator fun getValue(thisRef: Any?, property: KProperty<*>): String {
        return "$thisRef, thank you for delegating '${property.name}' to me!"
    }

    operator fun setValue(thisRef: Any?, property: KProperty<*>, value: String) {
        println("$value has been assigned to '${property.name}' in $thisRef.")
    }
}


fun main() {
    val e = Example()
    e.p = "setV"
    println(e.p)
}
