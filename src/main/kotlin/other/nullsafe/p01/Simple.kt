package org.dodo.other.nullsafe.p01

fun notRun(){
//    // Assigns a non-null string to a variable
//    var a: String = "abc"
//    // Attempts to re-assign null to the non-nullable variable
//    a = null
//    print(a)
//    // Null can not be a value of a non-null type String
}

fun run01(){
    // Assigns a non-null string to a variable
    val a: String = "abc"
    // Returns the length of a non-nullable variable
    val l = a.length
    print(l)
    // 3
}

fun run02(){
    var b: String? = "abc"
    b = null
    print(b)
}

fun run03(){
    // Assigns a nullable string to a variable
    var b: String? = "abc"
    // Re-assigns null to the nullable variable
    b = null
    // Tries to directly return the length of a nullable variable
    val l = b?.length?.and(0)
    print(l)
    // Only safe (?.) or non-null asserted (!!.) calls are allowed on a nullable receiver of type String?
}


fun main() {
    notRun()
//    run01()
//    run02()
    run03()
}
