package org.dodo.classAndObj.delegated.propByMap

class User(val map: Map<String, Any?>) {
    val name: String by map
    val age: Int     by map
}

class MutableUser(val map: MutableMap<String, Any?>) {
    var name: String by map
    var age: Int     by map
}

fun main() {
//    val user = User(mapOf(
//        "name" to "John Doe",
//        "age"  to 25
//    ))


    val user = MutableUser(mutableMapOf(
        "name" to "John Doe",
        "age"  to 25
    ))


//sampleStart
    println(user.name) // Prints "John Doe"
    println(user.age)  // Prints 25
//sampleEnd
}
