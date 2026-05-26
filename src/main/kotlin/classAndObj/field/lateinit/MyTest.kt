package org.dodo.classAndObj.field.lateinit

@TestCase
public class MyTest {
    lateinit var subject: TestSubject

    @SetUp
    fun setup() {
        subject = TestSubject()
    }

    @Test
    @TestInfo(priority = 1, description = "测试基本方法调用")
    fun test() {
        if(this::subject.isLateinit){
            println("MyTest subject 已经初始化")
        }
        subject.method()
        println("执行测试方法 test()")
    }

    @Test
    @TestInfo(priority = 2, description = "测试另一个功能", enabled = false)
    fun testAnotherFeature() {
        println("执行另一个测试 testAnotherFeature()")
    }
}

public class TestSubject{
    fun method(){
        println("TestSubject 的方法被调用")
    }
}


fun main() {
    val test = MyTest()
    runTests(test)
}
