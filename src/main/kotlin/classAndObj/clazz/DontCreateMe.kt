package org.dodo.classAndObj.clazz


/**
 * 如果你不希望你的类有一个公有构造函数，那么声明一个带有非默认可见性的空的主构造函数：
 */
class DontCreateMe private constructor() { /*……*/ }
