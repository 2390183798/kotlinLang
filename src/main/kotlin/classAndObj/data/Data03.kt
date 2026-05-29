package org.dodo.classAndObj.data

//data class User02(val name: String, val age: Int = 18) {
//    fun copy(name: String = this.name, age: Int = this.age) = User02(name, age)
//}

fun main() {
//    val jack = User(name = "Jack", age = 1)
    val jack = User("Jack", 1)
    val olderJack = jack.copy(age = 2)

    println("jack:  $jack")
    println("olderJack:  $olderJack")

    val (name, age) = jack
    println("$name, $age years of age")
}
