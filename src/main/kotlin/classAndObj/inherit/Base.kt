package org.dodo.classAndObj.inherit

//sampleStart
open class Base(val name: String) {

    init { println("Base:: Initializing a base class") }

    open val size: Int =
        name.length.also { println("Base:: Initializing size in the base class: $it") }
}

class Derived(
    name: String,
    val lastName: String,
) : Base(name.replaceFirstChar { it.uppercase() }.also { println("Argument for the base class: $it") }) {

    init { println("Derived:: Initializing a derived class") }

    override val size: Int =
        (super.size + lastName.length).also { println("Derived:: Initializing size in the derived class: $it") }
}
//sampleEnd

fun main() {
    println("== Constructing the derived class(\"hello\", \"world\")")
    Derived("hello", "world")
}
