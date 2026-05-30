package org.dodo.classAndObj.delegated.propByOther.p01


var topLevelInt: Int = 100
class ClassWithDelegate(val anotherClassInt: Int)
var topLevelClass: ClassWithDelegate = ClassWithDelegate(200)

class MyClass(var memberInt: Int, val anotherClassInstance: ClassWithDelegate) {
    var delegatedToMember: Int by this::memberInt
    var delegatedToTopLevel: Int by ::topLevelInt

    val delegatedToAnotherClass: Int by anotherClassInstance::anotherClassInt
}
var MyClass.extDelegated: Int by ::topLevelInt
var MyClass.extDelegated02: ClassWithDelegate by ::topLevelClass


fun main() {
    val delegate = ClassWithDelegate(22)
    val clazz = MyClass(11,delegate)
    println("clazz.delegatedToMember: ${clazz.delegatedToMember}")
    println("clazz.delegatedToTopLevel: ${clazz.delegatedToTopLevel}")
    println("clazz.delegatedToAnotherClass: ${clazz.delegatedToAnotherClass}")
    println("clazz.extDelegated: ${clazz.extDelegated}")
    println("clazz.extDelegated02: ${clazz.extDelegated02.anotherClassInt}")
}
