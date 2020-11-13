// 191 코틀린에서 자바 코드 접근하기: Null 안전성

package ex_java_to_kotlin_null_safety

import JavaInterface

class KotlinClass : JavaInterface
{
    override fun trim(str: String): String {
        // String! 타입은 String?나 String으로 적을 수 있다. 일반적으로 String?로 적어주는 것이 안전하다.
        // 절대로 null이 들어오지 않는다는 확신이 있다면 String으로 적어도 무방하다.
        // String으로 적었지만 null이 들어온다면 KotlinNullPointerException이 발생한다.
        return str?.trim() ?: ""
    }
}

fun main(args: Array<String>)
{
    val javaInterface: JavaInterface = KotlinClass()
    println(javaInterface.trim(" hi "))
}