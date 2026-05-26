package org.dodo.classAndObj.clazz

/**
 * 多个构造函数的时候
 *      次构造函数 用constructor ，写在 类里面
 */
class Person(val name: String) {
    val children: MutableList<Person> = mutableListOf()
    constructor(name: String, parent: Person) : this(name) {
        parent.children.add(this)
    }
}


///**
// * 构造函数，传入 其他对象， 处理 关联
// */
//class Person(val pets: MutableList<Pet> = mutableListOf())
//class Pet {
//    constructor(owner: Person) {
//        owner.pets.add(this) // adds this pet to the list of its owner's pets
//    }
//}


///**
// * val person = Person("John", "Doe", 25)
// *
// * // ✅ 可以修改年龄
// * person.age = 26
// *
// * // ❌ 编译错误：Val cannot be reassigned
// * // person.firstName = "Jane"
// */
//class Person(
//    val firstName: String,
//    val lastName: String,
//    var age: Int, // 尾部逗号
//) { /*……*/ }


///**
// * 构造函数 简写
// */
//class Person(firstName: String) {
//}


///**
// * 构造函数
// */
//class Person constructor(firstName: String) { /*……*/ }
