package org.dodo.classAndObj.data

class Data {
}


data class User(val name: String, val age: Int = 18)


fun main() {
    val user  = User("zs")
    val user2  = User("li", 22)
    println(user)
    println(user2)
}
