package org.dodo.classAndObj.field.lateinit

import kotlin.jvm.java

/**
 * 标记 初始化方法
 */
@Target(AnnotationTarget.FUNCTION)
@Retention(AnnotationRetention.RUNTIME)
annotation class SetUp


/**
 * 标记测试方法
 */
@Target(AnnotationTarget.FUNCTION)
@Retention(AnnotationRetention.RUNTIME)
annotation class Test

/**
 * 标记测试类
 */
@Target(AnnotationTarget.CLASS)
@Retention(AnnotationRetention.RUNTIME)
annotation class TestCase

/**
 * 带参数的注解示例
 * @property priority 优先级，默认为 0
 * @property enabled 是否启用，默认为 true
 * @property description 描述信息
 */
@Target(AnnotationTarget.FUNCTION)
@Retention(AnnotationRetention.RUNTIME)
annotation class TestInfo(
    val priority: Int = 0,
    val enabled: Boolean = true,
    val description: String = ""
)


fun runTests(testInstance: Any) {
    val clazz = testInstance.javaClass

    // 检查类是否有 @TestCase 注解
    if (!clazz.isAnnotationPresent(TestCase::class.java)) {
        println("${clazz.simpleName} 不是测试类")
        return
    }

    println("开始运行测试类: ${clazz.simpleName}\n")

    // 获取所有方法
    val methods = clazz.declaredMethods

    // 先执行标记了 @SetUp 的方法
    val setUpMethods = methods.filter { it.isAnnotationPresent(SetUp::class.java) }
    setUpMethods.forEach { method ->
        println("执行初始化: ${method.name}")
        method.invoke(testInstance)
    }

    if (setUpMethods.isNotEmpty()) {
        println()
    }

    // 再执行标记了 @Test 的方法
    val testMethods = methods.filter { it.isAnnotationPresent(Test::class.java) }
    testMethods.forEach { method ->
        // 获取 @TestInfo 注解信息
        val testInfo = method.getAnnotation(TestInfo::class.java)

        if (testInfo != null && !testInfo.enabled) {
            println("跳过禁用的测试: ${method.name} - ${testInfo.description}")
            return@forEach
        }

        try {
            print("运行测试 [优先级: ${testInfo?.priority ?: 0}]: ${method.name}")
            if (testInfo?.description?.isNotBlank() == true) {
                print(" - ${testInfo.description}")
            }
            println()

            method.invoke(testInstance)
            println("✓ 测试通过\n")
        } catch (e: Exception) {
            println("✗ 测试失败: ${e.cause?.message}\n")
        }
    }

    println("测试执行完成")
}
