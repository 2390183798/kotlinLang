package org.dodo.classAndObj.spClass.objectC.companionObject

import org.dodo.classAndObj.spClass.objectC.companionObject.interf.User

class User(val name: String) {
    // Defines a companion object that acts as a factory for creating User instances
    companion object Factory {
        fun create(name: String): User = User(name)
    }
}

class User02(val name: String) {
    // Defines a companion object without a name
    companion object {
        fun create(name: String): User02 = User02(name)
    }
}

class User03(val name: String) {
    companion object {
        private val defaultGreeting = "Hello"
    }

    fun sayHi() {
        println(defaultGreeting)
    }
}


fun main(){
    // Calls the companion object's factory method using the class name as the qualifier.
    // Creates a new User instance
    val userInstance = User.create("John Doe")
    println(userInstance.name)
    // John Doe

    // Accesses the companion object
    val companionUser = User02.create("Companion")
    println(companionUser.name)

    //
    User03("User03").sayHi()

}
