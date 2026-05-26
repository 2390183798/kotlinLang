package org.dodo.classAndObj.field.main

class Address {
    var name: String = "Holmes, Sherlock"
    var street: String = "Baker"
    var city: String = "London"
    var state: String? = null
    var zip: String = "123456"

    fun copyAddress(address: Address): Address {
        val result = Address() // Kotlin 中没有“new”关键字
        result.name = address.name // 将调用访问器
        result.street = address.street
        result.city = address.city
        result.state = address.state
        result.zip = address.zip
        return result
    }
}
